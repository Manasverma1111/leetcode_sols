class Solution {
    public String removeDuplicateLetters(String s) {
        
        int[] charCount = new int[26];

        for (char ch : s.toCharArray()) {
            charCount[ch - 'a']++;
        }

        Stack<Character> charStk = new Stack<>();
        boolean[] inStack = new boolean[26];
        
        for (char ch : s.toCharArray()) {
            charCount[ch - 'a']--;

            if (inStack[ch - 'a']) {
                continue;
            }

            while (!charStk.isEmpty() && charStk.peek() > ch && charCount[charStk.peek() - 'a'] > 0) {
                inStack[charStk.pop() - 'a'] = false;
            }

            charStk.push(ch);
            inStack[ch - 'a'] = true;
        }

        StringBuilder res = new StringBuilder();
        for (char ch : charStk) {
            res.append(ch);
        }

        return res.toString();
    }
}
