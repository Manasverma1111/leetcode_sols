class Solution {
    public boolean isHappy(int n) {
        
       int slow = n, fast = n;
        
        do {
            slow = sumOfSqr(slow);
            fast = sumOfSqr(sumOfSqr(fast));
        } while (slow != fast);
        
        return slow == 1;  
    }
    
    private int sumOfSqr(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
