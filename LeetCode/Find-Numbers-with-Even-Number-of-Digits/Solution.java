class Solution {
    public int findNumbers(int[] nums) {
        
        int numCount = 0;
        for (int num : nums) {
            if (evenDig(num)) {
                numCount++;
            }
        }

        return numCount;
    }

    static boolean evenDig(int num) {
        
        int numDig = digCount(num);
        return numDig % 2 == 0;
    }

    static int digCount(int num) {

        int evenCount = 0;

        while (num > 0) {
            evenCount++;
            num /= 10;
        }

        return evenCount;
    }
}
