class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean[] found = new boolean[26];
        int count = 0;

        for (char ch : sentence.toCharArray()) {
            int index = ch - 'a';
            if (!found[index]) {
                found[index] = true;
                count++;
                if (count == 26) {
                    return true;
                }
            }
        }
        return count == 26;
    }
}