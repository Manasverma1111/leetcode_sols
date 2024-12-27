class Solution {
    public int fillCups(int[] amount) {
        
        int seconds = 0;

        while (true) {
            Arrays.sort(amount);

            if (amount[2] == 0) {
                break;
            }

            if (amount[1] > 0) {
                amount[2]--;
                amount[1]--;
            } else {
                amount[2]--;
            }

            seconds++;
        }

        return seconds;
    }
}
