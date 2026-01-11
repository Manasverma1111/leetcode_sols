1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int n = nums.length;
5        int[] newArr = new int[n];
6
7        int leftProd = 1;
8        for (int i = 0; i < n; i++) {
9            newArr[i] = leftProd;
10            leftProd *= nums[i];
11        }
12
13        int rightProd = 1;
14        for (int j = n - 1; j >= 0; j--) {
15            newArr[j] *= rightProd;
16            rightProd *= nums[j];
17        }
18
19        // for (int i = 0; i < n; i++) {
20        //     int prod = 1;
21        //     for (int j = 0; j < n; j++) {
22        //         if (i != j) {
23        //             prod *= nums[j];
24        //         }
25        //         newArr[i] = prod;
26        //     }
27        // }
28
29        return newArr;
30    }
31}