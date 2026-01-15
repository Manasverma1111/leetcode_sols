1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if (s.length() != t.length()) {
5            return false;
6        }
7
8        int[] freq = new int[26];
9        for (char ch : s.toCharArray()) {
10            freq[ch - 'a']++;
11        }
12
13        for (char ch : t.toCharArray()) {
14            freq[ch - 'a']--;
15        }
16
17        for (int count : freq) {
18            if (count != 0) {
19                return false;
20            }
21        }
22
23        return true;
24
25    }
26}