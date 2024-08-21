import java.util.Scanner;

class reverseInt {
    public int reverse(int x) {
        long result = 0;
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);

        while (x != 0) {
            int lastDigit = x % 10;
            result = result * 10 + lastDigit;
            x = x / 10;
        }

        result = result * sign;

        // Check for overflow
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();

        reverseInt solution = new reverseInt();
        int reversed = solution.reverse(x);

        System.out.println("Reversed integer: " + reversed);
    }
}
