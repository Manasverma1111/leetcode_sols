class Solution {
    public int findRadius(int[] houses, int[] heaters) {

       Arrays.sort(houses);
        Arrays.sort(heaters);

        int radius = 0;
        int heaterIndex = 0;

        for (int house : houses) {
            while (heaterIndex < heaters.length - 1 &&
                   Math.abs(heaters[heaterIndex + 1] - house) <= Math.abs(heaters[heaterIndex] - house)) {
                heaterIndex++;
            }
            int closestDist = Math.abs(heaters[heaterIndex] - house);
            radius = Math.max(radius, closestDist);
        }

        return radius;
    }
}
