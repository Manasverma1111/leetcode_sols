class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1);
        minCoins[0] = 0;

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                minCoins[j] = Math.min(minCoins[j], minCoins[j - coin] + 1);
            }
        }

        return minCoins[amount] > amount ? -1 : minCoins[amount];
    }
}