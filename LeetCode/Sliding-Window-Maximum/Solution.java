class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> deq = new LinkedList<>();

        for (int i  = 0; i < n; i++) {
            if (!deq.isEmpty() && deq.peek() <= i - k) {
                deq.poll();
            }
            while (!deq.isEmpty() && nums[deq.peekLast()] < nums[i]) {
                deq.pollLast();
            }

            deq.offer(i);

            if (i >= k - 1) {
                res[i - k + 1] = nums[deq.peek()];
            }
        }

        return res;
    }
}