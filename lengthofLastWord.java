import java.util.Scanner;

class lengthofLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int length = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                length++;
            } else if(length > 0) {
                break;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        lengthofLastWord solution = new lengthofLastWord();
        int result = solution.lengthOfLastWord(inputString);

        System.out.println("The length of the last word is: " + result);
    }
}
