import java.util.Scanner;

class MajorityElmt {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer majority = null;
        for (int num : nums) {
            if (count == 0) {
                majority = num;
            }
            count += (majority == num) ? 1 : -1;
        }
        return majority;
    }

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.println("Enter the number of elements in the array:");
        int n = input.nextInt();

        // Create an array of size n
        int[] nums = new int[n];

        // Take the array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Close the scanner
        input.close();

        // Create an instance of the Solution class
        MajorityElmt solution = new MajorityElmt();

        // Find the majority element and print the result
        int majorityElement = solution.majorityElement(nums);
        System.out.println("The majority element is: " + majorityElement);
    }
}
