SELECT ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM(
    SELECT *,
        COUNT(*) OVER (PARTITION BY tiv_2015) AS tiv_2015_cnt,
        COUNT(*) OVER (PARTITION BY lat, lon) AS location_cnt
    FROM insurance
) t
WHERE tiv_2015_cnt > 1 AND location_cnt = 1;
