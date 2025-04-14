class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

        int totalTime = arrivalTime + delayedTime;
        if (totalTime == 24){
            return 0;
        } else {
            return totalTime % 24; 
        }
    }
