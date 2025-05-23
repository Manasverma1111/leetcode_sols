class Solution {
    public int minimumOperations(int[] nums) {
            
        int oprs = 0;
        
        while (true) {
            HashSet<Integer> seen = new HashSet<>();
            boolean hasDuplicates = false;

            for (int num : nums) {
                if (seen.contains(num)) {
                    hasDuplicates = true;
                    break;
                }
                seen.add(num);
            }

            if (!hasDuplicates) {
                break;
            }

            oprs++;
            nums = removeFirstThreeElements(nums);
        }

        return oprs;
    }

    private static int[] removeFirstThreeElements(int[] nums) {
        if (nums.length <= 3) {
            return new int[0];
        }

        int[] res = new int[nums.length - 3];
        System.arraycopy(nums, 3, res, 0, nums.length - 3);
        return res;
    }
}
