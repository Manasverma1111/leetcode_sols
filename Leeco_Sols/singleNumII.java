import java.util.Scanner;

class SingleNumII {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums) {
            ones = (ones ^ num) & ~twos;    //holds the XOR result for numbers that appear once.
            twos = (twos ^ num) & ~ones;    //holds the XOR result for numbers that appear twice.
        }

        return ones;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for the array length
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Taking input for the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Create an instance of Solution and find the single number
        SingleNumII sol = new SingleNumII();
        int single = sol.singleNumber(nums);

        System.out.println("The single number is: " + single);
    }
}
