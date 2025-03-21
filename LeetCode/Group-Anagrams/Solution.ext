class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagram = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];
            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }

            String key = Arrays.toString(count);
            anagram.putIfAbsent(key, new ArrayList<>());
            anagram.get(key).add(str);
        }

        return new ArrayList<>(anagram.values());
    }
}