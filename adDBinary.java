import java.util.Scanner;

class adDBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0)
                carry += a.charAt(i--) - '0';
            if (j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input the first binary string
        System.out.print("Enter the first binary number: ");
        String a = scanner.nextLine();

        // Ask user to input the second binary string
        System.out.print("Enter the second binary number: ");
        String b = scanner.nextLine();

        adDBinary solution = new adDBinary()
                ;
        String result = solution.addBinary(a, b);

        // Print the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
