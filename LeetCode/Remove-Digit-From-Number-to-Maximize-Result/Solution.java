class Solution {
    public String removeDigit(String number, char digit) {
        
        String maxRes = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String newNum = number.substring(0, i) + number.substring(i + 1);

                if (newNum.compareTo(maxRes) > 0) {
                    maxRes = newNum;
                }
            }
        }

        return maxRes;
    }
}
