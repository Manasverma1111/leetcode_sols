class Solution {
    public int countDigits(int num) {
        
        int count = 0;
        int orgNum = num;

        while (num > 0){
            int rem = num % 10;
            if (rem != 0 && orgNum % rem == 0){
                count++;
            }

            num /= 10;
        }

        return count;
    }
}