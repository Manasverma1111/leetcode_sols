1class Solution {
2    public String defangIPaddr(String address) {
3        
4        String newStr = address.replace(".", "[.]");
5        return newStr;
6    }
7}