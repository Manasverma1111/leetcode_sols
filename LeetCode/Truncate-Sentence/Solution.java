class Solution {
    public String truncateSentence(String s, int k) {
        
        String[] words = s.split(" ");

        StringBuilder trunc = new StringBuilder();

        for (int i = 0; i < k; i++) {
            trunc.append(words[i]);
            if (i != k - 1) {
                trunc.append(" ");
            }
        }

        return trunc.toString();
    }
}