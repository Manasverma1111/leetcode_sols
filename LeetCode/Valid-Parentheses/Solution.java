1class Solution {
2    public boolean isValid(String s) {
3        
4        Stack<Character> stk = new Stack<>();
5        for (char ch : s.toCharArray()) {
6            if (ch == '(' || ch == '[' || ch == '{') {
7                stk.push(ch);
8            } else {
9                if (stk.isEmpty()) {
10                    return false;
11                }
12
13                char top = stk.peek();
14                if ((top == '(' && ch == ')') || (top == '[' && ch == ']') || (top == '{' && ch == '}')) {
15                    stk.pop();
16                } else {
17                    return false;
18                }
19            }
20        }
21
22        return stk.isEmpty();
23    }
24}