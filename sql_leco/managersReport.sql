-- Method 01

SELECT e.name
FROM Employee AS e
INNER JOIN Employee AS m ON e.id = m.managerId
GROUP BY m.managerId
HAVING COUNT(m.managerId) >= 5;


-- Method 02

SELECT E1.name
FROM Employee E1
JOIN (
    SELECT managerId, COUNT(*) AS directReports
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(*) >= 5
) E2 ON E1.id = E2.managerId;


-- Method 03

SELECT a.name 
FROM Employee a 
JOIN Employee b ON a.id = b.managerId 
GROUP BY b.managerId 
HAVING COUNT(*) >= 5