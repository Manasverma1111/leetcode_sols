import java.util.Scanner;

class plusone {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the number of digits: ");
        int n = scanner.nextInt();

        int[] digits = new int[n];

        // Ask user to input the digits
        System.out.println("Enter the digits: ");
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }

        plusone solution = new plusone();
        int[] result = solution.plusOne(digits);

        // Print the result
        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit);
        }
        System.out.println();

        scanner.close();
    }
}
