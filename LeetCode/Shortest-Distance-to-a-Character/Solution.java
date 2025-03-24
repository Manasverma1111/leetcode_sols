class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int n = s.length();
        int[] answer = new int[n];
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0 ; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }

            answer[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }

            answer[i] = Math.min(answer[i], prev - i);
        }

        return answer;

    }
}
