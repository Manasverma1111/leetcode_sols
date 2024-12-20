class Solution {
    public int longestPalindrome(String s) {
        
        int[] count = new int[52];

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                count[ch - 'a']++;
            } else if (Character.isUpperCase(ch)) {
                count[ch - 'A' + 26]++;
            }
        } 

        int palindromeLen = 0;
        boolean hasOdd = false;

        for (int cnt : count) {
            palindromeLen += cnt / 2 * 2;

            if (cnt % 2 == 1) {
                hasOdd = true;
            } 
        }

        if (hasOdd) {
            palindromeLen += 1;
        }

        return palindromeLen;
    }
}
