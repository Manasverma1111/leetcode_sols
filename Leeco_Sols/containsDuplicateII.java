import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                seen.remove(nums[i - k - 1]);
            }
            if (!seen.add(nums[i])) {
                return true;
            }
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

        // Ask the user to input the value of k
        System.out.println("Enter the value of k (the index difference):");
        int k = input.nextInt();

        // Close the scanner
        input.close();

        // Create an instance of the Solution class
        ContainsDuplicateII solution = new ContainsDuplicateII();

        // Check if the array contains nearby duplicates within range k
        boolean result = solution.containsNearbyDuplicate(nums, k);
        if (result) {
            System.out.println("True: The array contains nearby duplicate elements within the given range.");
        } else {
            System.out.println("False: The array does not contain nearby duplicate elements within the given range.");
        }
    }
}
