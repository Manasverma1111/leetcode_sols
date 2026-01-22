1class Solution {
2    public int strStr(String haystack, String needle) {
3     int haylength = haystack.length();
4     int needlelength = needle.length();
5     if(haylength<needlelength)
6        return -1;
7        for(int i=0; i<=haylength-needlelength; i++){
8            int j=0;
9            while(j<needlelength && haystack.charAt(i+j) == needle.charAt(j))
10            j++;
11            if(j == needlelength){
12                return i;
13            }
14        }
15         return -1;
16     }  
17     
18    }
19