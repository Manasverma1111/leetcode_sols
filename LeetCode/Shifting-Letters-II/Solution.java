class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        
        int n = s.length();
        int[] shiftEffect = new int[n + 1];
        
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            
            if (direction == 1) { 
                shiftEffect[start] += 1;
                shiftEffect[end + 1] -= 1;
            } else {
                shiftEffect[start] -= 1;
                shiftEffect[end + 1] += 1;
            }
        }
        
        int[] netShifts = new int[n];
        int runningSum = 0;
        for (int i = 0; i < n; i++) {
            runningSum += shiftEffect[i];
            netShifts[i] = runningSum;
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char originalChar = s.charAt(i);
            int shift = netShifts[i];
            int newCharIndex = (originalChar - 'a' + shift) % 26;
            if (newCharIndex < 0) { 
                newCharIndex += 26;
            }
            result.append((char) ('a' + newCharIndex));
        }
        
        return result.toString();
    }
}
