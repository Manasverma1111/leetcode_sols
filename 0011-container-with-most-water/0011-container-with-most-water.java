class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = Integer.MIN_VALUE;
        int currArea = 0;
        int i=0, j=height.length-1;

        while(i<j){
            currArea = Math.min(height[i], height[j])*(j-i);
            maxArea = Math.max(currArea, maxArea);
            if(height[i] < height[j]){
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}