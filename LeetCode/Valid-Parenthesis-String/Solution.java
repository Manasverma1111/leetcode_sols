class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> parenStk = new Stack<>();
        Stack<Integer> starStk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                parenStk.push(i);
            } else if (ch == '*') {
                starStk.push(i);
            } else {
                if (!parenStk.isEmpty()) {
                    parenStk.pop();
                } else if (!starStk.isEmpty()) {
                    starStk.pop();
                } else {
                    return false;
                }
            }
        }

        while (!parenStk.isEmpty() && !starStk.isEmpty()) {
            if (parenStk.peek() < starStk.peek()) {
                parenStk.pop();
                starStk.pop();
            } else {
                return false;
            }
        }

        return parenStk.isEmpty();
    }
}
