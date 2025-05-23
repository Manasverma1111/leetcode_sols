class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : (s1 + " " + s2).split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                res.add(entry.getKey());
            }
        }

        return res.toArray(new String[0]);
    }
}
