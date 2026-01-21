1class Solution {
2    public String defangIPaddr(String address) {
3        
4        return address.replace(".", "[.]");
5    }
6}