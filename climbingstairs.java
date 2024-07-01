import java.util.Scanner;

class climbingstairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input the number of stairs
        System.out.print("Enter the number of stairs: ");
        int n = scanner.nextInt();

        climbingstairs solution = new climbingstairs();
        int result = solution.climbStairs(n);

        // Print the result
        System.out.println("Number of ways to climb " + n + " stairs is: " + result);

        scanner.close();
    }
}
