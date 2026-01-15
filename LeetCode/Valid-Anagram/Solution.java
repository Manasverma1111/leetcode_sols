1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if (s.length() != t.length()) {
5            return false;
6        }
7
8        int[] freq = new int[26];
9        for (int i = 0; i < s.length(); i++) {
10            freq[s.charAt(i) - 'a']++;
11            freq[t.charAt(i) - 'a']--;
12        }
13
14        for (int count : freq) {
15            if (count != 0) {
16                return false;
17            }
18        }
19
20        return true;
21
22    }
23}