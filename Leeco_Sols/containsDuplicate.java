import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
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
        ContainsDuplicate solution = new ContainsDuplicate();

        // Check if the array contains duplicates and print the result
        boolean containsDuplicate = solution.containsDuplicate(nums);
        if (containsDuplicate) {
            System.out.println("True: The array contains duplicate elements.");
        } else {
            System.out.println("False: The array does not contain duplicate elements.");
        }
    }
}
