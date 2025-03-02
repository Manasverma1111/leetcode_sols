class Solution {
    public int numDecodings(String s) {
        
        if (s == null || s.length() == 0) {
            return 0;
        }

       int n = s.length();
        int prev2 = 1;
        int prev1 = s.charAt(0) != '0' ? 1 : 0; 

        for (int i = 2; i <= n; i++) {
            int current = 0;

            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            if (oneDigit >= 1 && oneDigit <= 9) {
                current += prev1;
            }

            int twoDigits = Integer.parseInt(s.substring(i - 2, i)); 
            if (twoDigits >= 10 && twoDigits <= 26) {
                current += prev2;
            }

            prev2 = prev1;
            prev1 = current;
        }

            return prev1;
    }
}
