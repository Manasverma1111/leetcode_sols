1class Solution {
2    public boolean isAnagram(String s, String t) {
3        
4        if (s == null || t == null) {
5            return false;
6        }
7
8        s = s.replaceAll("\\s+", "").toLowerCase();
9        t = t.replaceAll("\\s+", "").toLowerCase();
10
11        if (s.length() != t.length()) {
12            return false;
13        }
14
15        int[] freq = new int[26];
16        for (int i = 0; i < s.length(); i++) {
17            freq[s.charAt(i) - 'a']++;
18            freq[t.charAt(i) - 'a']--;
19        }
20
21        for (int count : freq) {
22            if (count != 0) {
23                return false;
24            }
25        }
26
27        return true;
28
29    }
30}