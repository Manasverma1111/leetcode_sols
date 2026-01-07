1class Solution {
2    public void reverseString(char[] s) {
3        
4        int left = 0;
5        int right = s.length - 1;
6
7        while (left < right) {
8            char temp = s[left];
9            s[left] = s[right];
10            s[right] = temp;
11
12            left++;
13            right--;
14        }
15    }
16}