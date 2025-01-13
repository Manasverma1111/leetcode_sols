class Solution {
    public int minimumLength(String s) {
        
        int[] freqCount = new int[26];
        for (char ch : s.toCharArray()) {
            freqCount[ch - 'a']++;
        }

        int minLen = 0;
        for (int freq : freqCount) {
            if (freq == 0) {
                continue;
            }
            if (freq % 2 == 0) {
                minLen += 2;
            } else {
                minLen += 1;
            }
        }

        return minLen;
    }
}
