import java.util.Scanner;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Arrays to store character mappings for ASCII characters
        int[] mapST = new int[256];
        int[] mapTS = new int[256];
        
        // Initialize arrays with -1 to indicate no mapping yet
        for (int i = 0; i < 256; i++) {
            mapST[i] = -1;
            mapTS[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If there is an existing inconsistent mapping, return false
            if (mapST[c1] == -1 && mapTS[c2] == -1) {
                mapST[c1] = c2; // Map c1 -> c2
                mapTS[c2] = c1; // Map c2 -> c1
            } else if (mapST[c1] != c2 || mapTS[c2] != c1) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings from the user
        System.out.print("Enter the first string (s): ");
        String s = scanner.nextLine();

        System.out.print("Enter the second string (t): ");
        String t = scanner.nextLine();

        // Create an instance of Solution and check if strings are isomorphic
        Solution solution = new Solution();
        boolean result = solution.isIsomorphic(s, t);

        // Output the result
        System.out.println("Are the strings isomorphic? " + result);

        scanner.close();
    }
}
