class Solution {
    public int[] minOperations(String boxes) {
        
        int n = boxes.length();
        int[] ans = new int[n];

        int count = 0 ;
        int opr = 0;
        for (int i = 0; i < n; i++) {
            ans[i] += opr;
            if (boxes.charAt(i) == '1') {
                count++;
            }

            opr += count;
        }

        count = 0;
        opr = 0;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] += opr;
            if (boxes.charAt(i) == '1') {
                count++;
            }

            opr += count;
        }

        return ans;
    }
}
