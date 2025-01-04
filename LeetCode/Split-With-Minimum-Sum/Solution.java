class Solution {
    public int splitNum(int num) {
        
        char[] digits = String.valueOf(num).toCharArray();
        
        Arrays.sort(digits);
        
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        
        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                num1.append(digits[i]);
            } else {
                num2.append(digits[i]);
            }
        }
        
        int number1 = num1.length() > 0 ? Integer.parseInt(num1.toString()) : 0;
        int number2 = num2.length() > 0 ? Integer.parseInt(num2.toString()) : 0;
        
        return number1 + number2;
    }
}
