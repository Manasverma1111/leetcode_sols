class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int totalApple = 0;
        for (int num : apple) {
            totalApple += num;
        }   

        Arrays.sort(capacity);

        int boxesUsed = 0;
        int currCapacity = 0;

        for (int i = capacity.length - 1; i >= 0; i--) {
            currCapacity += capacity[i];
            boxesUsed++;

            if (currCapacity >= totalApple) {
                break;
            }
        }

        return boxesUsed;
    }
}
