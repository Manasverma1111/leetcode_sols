class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        int lines = 1;
        int currWidth = 0;

        for (char ch : s.toCharArray()) {
            int charWidth = widths[ch - 'a'];

            if (currWidth + charWidth > 100) {
                lines++;
                currWidth = charWidth;
            } else {
                currWidth += charWidth;
            }
        }

        return new int[]{lines, currWidth};
    }
}
