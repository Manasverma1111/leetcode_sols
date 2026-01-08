1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        
4         if (s.length() != t.length()) {
5            return false;
6        }
7
8        int[] mapST = new int[256];
9        int[] mapTS = new int[256];
10        
11        for (int i = 0; i < 256; i++) {
12            mapST[i] = -1;
13            mapTS[i] = -1;
14        }
15
16        for (int i = 0; i < s.length(); i++) {
17            char c1 = s.charAt(i);
18            char c2 = t.charAt(i);
19
20            if (mapST[c1] == -1 && mapTS[c2] == -1) {
21                mapST[c1] = c2; 
22                mapTS[c2] = c1; 
23            } else if (mapST[c1] != c2 || mapTS[c2] != c1) {
24                return false;
25            }
26        }
27        
28        return true;
29    }
30}