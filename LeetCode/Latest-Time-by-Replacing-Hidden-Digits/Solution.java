class Solution {
    public String maximumTime(String time) {
        
        char[] timeArr = time.toCharArray();

        if (timeArr[0] == '?') {
            timeArr[0] = (timeArr[1] == '?' || timeArr[1] <= '3') ? '2' : '1';
        }
        if (timeArr[1] == '?') {
            timeArr[1] = (timeArr[0] == '2') ? '3' : '9';
        }

        if (timeArr[3] == '?') {
            timeArr[3] = '5';
        }
        if (timeArr[4] == '?') {
            timeArr[4] = '9';
        }

        if (timeArr[0] == '2' && timeArr[1] > '3') {
            timeArr[0] = '1';
        }

        return new String(timeArr);
    }
}
