class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stk = new Stack<>();

        for (int num : nums2) {
            while (!stk.isEmpty() && stk.peek() < num) {
                nextGreaterMap.put(stk.pop(), num);
            }

            stk.push(num);
        }

        while (!stk.isEmpty()) {
            nextGreaterMap.put(stk.pop(), -1);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nextGreaterMap.get(nums1[i]);
        }

        return res;
    }
}