1class Solution {
2
3    // public void reverseArr(int[] arr, int start, int end) {
4
5    //     while (start < end) {
6    //         int temp = arr[start];
7    //         arr[start] = arr[end];
8    //         arr[end] = temp;
9
10    //         start++;
11    //         end--;
12    //     }
13    // }
14
15    public void rotate(int[] nums, int k) {
16        
17        // int n = nums.length;
18        // if (k > n) {
19        //     k = k % n;
20        // }
21
22        // reverseArr(nums, 0, n - 1);
23        // reverseArr(nums, 0, k - 1);
24        // reverseArr(nums, k, n - 1);
25        k = k % nums.length;
26        List<Integer> list = new ArrayList<>();
27
28        for (int num : nums) {
29            list.add(num);
30        }
31
32        Collections.rotate(list, k);
33        for (int i = 0; i < nums.length; i++) {
34            nums[i] = list.get(i);
35        }
36
37    }
38}