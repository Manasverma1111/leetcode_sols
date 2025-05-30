class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> freqCount = new HashMap<>();

        for (int num : arr) {
            freqCount.put(num, freqCount.getOrDefault(num, 0) + 1);
        }

        Set<Integer> seenFreq = new HashSet<>();

        for (int freq : freqCount.values()) {
            if (!seenFreq.add(freq)) {
                return false;
            }
        }
        return true;
    }
}