class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            } else {
                stk.push(ch);
            }
        }

        StringBuilder res = new StringBuilder();
        for (char ch : stk) {
            res.append(ch);
        }

        return res.toString();
    }
}