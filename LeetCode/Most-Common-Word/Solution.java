class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        String mostFreqWord = "";
        int maxCount = 0;

        for (String word : words) {
            if (!bannedWords.contains(word)) {
                int count = wordCount.getOrDefault(word, 0) + 1;
                wordCount.put(word, count);

                if (count > maxCount) {
                    mostFreqWord = word;
                    maxCount = count;
                }
            }
        }

        return mostFreqWord;
    }
}
