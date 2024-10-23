package com.manas.leetco;

import java.util.Scanner;

class MinSpeed {
    public int minSpeedOnTime(int[] dist, double hour) {

        if(hour < dist.length - 1) return -1;

        int left = 1;
        int right = 10000000;
        int ans  = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(check(dist, hour, mid)){
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public boolean check(int[] dist, double hour, int speed) {

        double time = 0;
        int i = 0;

        for(i = 0; i < dist.length - 1; i++) {
            time += Math.ceil((double) dist[i] / speed);
        }

        time += (double) dist[dist.length - 1] / speed;

        return (time <= hour);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for distances
        System.out.print("Enter the number of distances:");
        int n = scanner.nextInt();  // Number of distances
        int[] dist = new int[n];

        System.out.print("Enter the distances:");
        for (int i = 0; i < n; i++) {
            dist[i] = scanner.nextInt();  // Read each distance
        }

        // Taking input for the time (hour)
        System.out.print("Enter the total available time (hour):");
        double hour = scanner.nextDouble();  // Read the hour as a double

        // Creating a Solution object and calculating the minimum speed
        MinSpeed solution = new MinSpeed();
        int result = solution.minSpeedOnTime(dist, hour);

        // Output the result
        if (result == -1) {
            System.out.print("It is impossible to complete the journey within the given time.");
        } else {
            System.out.print("The minimum required speed is: " + result);
        }

        // Close the scanner
        scanner.close();
    }
}

