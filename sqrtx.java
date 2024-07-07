import java.util.Scanner;

class sqrtx {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) x) {
                end = mid - 1;
            } else if (mid * mid == x) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return Math.round(end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input the integer
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        sqrtx solution = new sqrtx();
        int result = solution.mySqrt(x);

        // Print the result
        System.out.println("The integer square root of " + x + " is: " + result);

        scanner.close();
    }
}
