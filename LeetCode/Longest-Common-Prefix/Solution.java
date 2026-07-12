1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        
4        int n = strs.length;
5        Arrays.sort(strs);
6        String first = strs[0];
7        String last = strs[n - 1];
8
9        StringBuilder sb = new StringBuilder();
10        int minLen = Math.min(first.length(), last.length());
11
12        for (int i = 0; i < minLen; i++) {
13            if (first.charAt(i) != last.charAt(i)) {
14                return sb.toString();
15            }
16
17            sb.append(first.charAt(i));
18        }
19
20        return sb.toString();
21    }
22}