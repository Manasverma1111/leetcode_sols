class Solution {
    public String interpret(String command) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < command.length(); ) {
            if (command.charAt(i) == 'G') {
                res.append("G");
                i++;
            } else if (command.startsWith("()", i)) {
                res.append("o");
                i += 2;
            } else if (command.startsWith("(al)", i)) {
                res.append("al");
                i += 4;
            }
        }

        return res.toString();
    }
}