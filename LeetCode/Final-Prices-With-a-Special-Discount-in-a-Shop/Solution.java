class Solution {
    public int[] finalPrices(int[] prices) {
        
         int n = prices.length;
        int[] stk = new int[n]; 
        int top = -1; 

        for (int i = 0; i < n; i++) {
            while (top >= 0 && prices[stk[top]] >= prices[i]) {
                prices[stk[top]] -= prices[i]; 
                top--;
            }
            stk[++top] = i; 
        }

        return prices;
    }
}
