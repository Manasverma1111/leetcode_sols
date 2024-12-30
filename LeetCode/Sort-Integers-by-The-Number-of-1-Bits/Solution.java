class Solution {
    public int[] sortByBits(int[] arr) {
        
         int[][] bitCountArr = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            bitCountArr[i][0] = arr[i];              
            bitCountArr[i][1] = Integer.bitCount(arr[i]);
        }

        Arrays.sort(bitCountArr, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = bitCountArr[i][0];
        }

        return arr;
    }
}
