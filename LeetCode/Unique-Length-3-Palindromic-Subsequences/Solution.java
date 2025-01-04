class Solution {
    public int countPalindromicSubsequence(String s) {
        
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (first[index] == -1) {
                first[index] = i;
            }
            last[index] = i;
        }

        Set<String> uniquePalindromes = new HashSet<>();

        for (int i = 0; i < 26; i++) {
            if (first[i] != -1 && last[i] != first[i]) {
                Set<Character> middleChars = new HashSet<>();
                for (int j = first[i] + 1; j < last[i]; j++) {
                    middleChars.add(s.charAt(j));
                }
                for (char c : middleChars) {
                    uniquePalindromes.add("" + (char) ('a' + i) + c + (char) ('a' + i));
                }
            }
        }

        return uniquePalindromes.size();
    }
}
