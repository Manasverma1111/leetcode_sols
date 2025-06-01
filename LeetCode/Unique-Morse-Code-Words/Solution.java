class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morseCode = new String[]{
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };

        Set<String> transformations = new HashSet<>();

        for (String word : words) {
            StringBuilder morse = new StringBuilder();
            for (char ch : word.toCharArray()) {
                morse.append(morseCode[ch - 'a']);
            }
            transformations.add(morse.toString());
        }

        return transformations.size();
    }
}