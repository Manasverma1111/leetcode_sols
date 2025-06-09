class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
           while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                int prev = stk.pop();
                res[prev] = i - prev;
           }
           stk.push(i);
        }

        return res;
    }
}