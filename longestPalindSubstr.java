import java.util.Scanner;

public class longestPalindSubstr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Create a Solution object and use the longestPalindrome method
        Sol solution = new Sol();
        String result = solution.longestPalindrome(input);

        // Print the result
        System.out.println("The longest palindromic substring is:");
        System.out.println(result);

        scanner.close();
    }
}

class Sol {
    public String longestPalindrome(String s) {
        int strLength = s.length();
        if (s.length() <= 1) {
            return s;
        }

        int maxLength = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < strLength; i++) {
            for (int j = i + maxLength; j <= strLength; j++) {
                if (j - i > maxLength && isPalindrome(s.substring(i, j))) {
                    maxLength = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
