class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
       int n = s.length();
        
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                boolean isValid = true;
                String substring = s.substring(0, len);
                
                for (int i = len; i < n; i += len) {
                    if (!s.startsWith(substring, i)) {
                        isValid = false;
                        break;
                    }
                }
                
                if (isValid) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
