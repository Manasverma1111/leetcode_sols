1class Solution {
2    public int strStr(String haystack, String needle) {
3     int haylength = haystack.length();
4     int needlelength = needle.length();
5     if(haylength<needlelength) {
6        return -1;
7     }
8        for(int i=0; i<=haylength-needlelength; i++){
9            int j=0;
10            while(j<needlelength && haystack.charAt(i+j) == needle.charAt(j))
11            j++;
12            if(j == needlelength){
13                return i;
14            }
15        }
16         return -1;
17     }  
18     
19    }