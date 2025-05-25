class Solution {
    public int longestPalindrome(String[] words) {
        
        Map<String, Integer> freq = new HashMap<>();
        int length = 0;
        boolean hasMiddle = false;

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();

            if (freq.getOrDefault(reversed, 0) > 0) {
                length += 4;
                freq.put(reversed, freq.get(reversed) - 1);
            } else {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        for (String word : freq.keySet()) {
            if (word.charAt(0) == word.charAt(1) && freq.get(word) > 0) {
                hasMiddle = true;
                break;
            }
        }

        return hasMiddle ? length + 2 : length;
    }
}