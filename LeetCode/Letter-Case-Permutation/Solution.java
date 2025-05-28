class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> res = new ArrayList<>();
        backTrack(s.toCharArray(), 0, res);
        return res;
    }

    private void backTrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        backTrack(chars, index + 1, result);

        if (Character.isLetter(chars[index])) {
            chars[index] ^= 32; 
            backTrack(chars, index + 1, result);
            chars[index] ^= 32; 
        }
    }
}