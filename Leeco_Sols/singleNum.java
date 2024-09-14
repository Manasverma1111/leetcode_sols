import java.util.Scanner;

class singleNum {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i]; // XOR operation
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        // Initialize the array
        int[] nums = new int[n];

        // Take input for the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Create an instance of the Solution class and call the singleNumber method
        singleNum solution = new singleNum();
        int result = solution.singleNumber(nums);

        // Print the result
        System.out.println("The single number is: " + result);

        input.close();
    }
}

