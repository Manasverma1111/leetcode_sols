class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int openCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch =='(') {
                if (openCount > 0) {
                    res.append(ch);
                } openCount++;
            } else { 
                openCount--;
                if (openCount > 0) {
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}
