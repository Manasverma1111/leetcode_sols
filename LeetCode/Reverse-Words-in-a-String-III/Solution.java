class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (String word : str) {
            res.append(new StringBuilder(word).reverse()).append(" ");
        }

        return res.toString().trim();
    }
}
