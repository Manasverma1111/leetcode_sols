1class Solution {
2    public boolean rotateString(String s, String goal) {
3        
4        if (s.length() != goal.length()) {
5            return false;
6        }
7
8        String newStr = s + s;
9        return newStr.contains(goal);
10    }
11}