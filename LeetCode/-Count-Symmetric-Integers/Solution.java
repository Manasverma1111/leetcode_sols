class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        
        for (int num = low; num <= high; num++) {
            int len = getLength(num);
            if (len % 2 != 0) continue; 

            int n = len / 2;
            int sum1 = 0, sum2 = 0;
            int temp = num;

            for (int i = 0; i < n; i++) {
                sum2 += temp % 10;
                temp /= 10;
            }

            for (int i = 0; i < n; i++) {
                sum1 += temp % 10;
                temp /= 10;
            }

            if (sum1 == sum2) {
                count++;
            }
        }

        return count;
    }

    private int getLength(int num) {
        int len = 0;
        while (num > 0) {
            len++;
            num /= 10;
        }
        return len;
    }
}
