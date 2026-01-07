1class Solution {
2    public int lengthOfLastWord(String s) {
3        s = s.trim();
4
5        int length = 0;
6        for(int i = s.length()-1; i >=0; i--){
7            if(s.charAt(i) != ' '){
8                length++;
9            } else if(length > 0){
10                break;
11            }
12        }
13        return length;
14    }
15}