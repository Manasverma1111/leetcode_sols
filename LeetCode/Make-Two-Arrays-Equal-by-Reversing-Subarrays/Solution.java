class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] numMap = new int[1001];
        for(int n : target){
            numMap[n]++;
        }

        for(int n : arr){
            numMap[n]--;
        }

        for(int i = 0; i < 1001; i++){
            if(numMap[i] != 0){
                return false;
            }
        }

        return true;
    }
}
