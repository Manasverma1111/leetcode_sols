class Solution {
    public String generateTheString(int n) {
        
        StringBuilder resStr = new StringBuilder();

        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                resStr.append('a');
            } 
        } else {
            for (int i = 0; i < n - 1; i++) {
                resStr.append('a');
            }
            resStr.append('b');
        }

        return resStr.toString();
    }
}