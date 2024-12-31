class Solution {
    public double average(int[] salary) {

        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int totalSalary = 0;

        for (int s : salary) {
            minSalary = Math.min(minSalary, s);
            maxSalary = Math.max(maxSalary, s);
            totalSalary += s;
        }

        int remSalary = totalSalary - minSalary - maxSalary;

        return (double) remSalary / (salary.length - 2);
    }
}
