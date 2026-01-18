1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<Character>();
4        for (char c: s.toCharArray()){
5            if(c == '(' || c == '[' || c == '{'){
6                stack.push(c);
7            } else{
8                if(stack.isEmpty()){
9                    return false;
10                }
11                char top = stack.peek();
12                if((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')){
13                    stack.pop();
14                } else{
15                    return false;
16                }
17            }
18        }
19        return stack.isEmpty();
20    }
21}