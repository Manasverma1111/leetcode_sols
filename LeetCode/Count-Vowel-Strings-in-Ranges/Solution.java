class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        
        int n = words.length;
        int[] prefixSum = new int[n + 1];
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        
        for (int i = 0; i < n; i++) {
            if (isVowelString(words[i], vowels)) {
                prefixSum[i + 1] = prefixSum[i] + 1;
            } else {
                prefixSum[i + 1] = prefixSum[i];
            }
        }
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefixSum[ri + 1] - prefixSum[li];
        }
        
        return result;
    }
    
    private static boolean isVowelString(String word, Set<Character> vowels) {
        return vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1));
    }
}
