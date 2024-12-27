class Solution {
    public int convertTime(String current, String correct) {
        
        int currentMin = inToMinutes(current);
        int correctMin = inToMinutes(correct);

        int diff = correctMin- currentMin;

        int opr = 0;
        int[] increments = {60, 15, 5, 1};
        for (int inc : increments) {
            opr += diff/inc;
            diff %= inc;
        }

        return opr;
    }

    private static int inToMinutes(String time) {

        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
