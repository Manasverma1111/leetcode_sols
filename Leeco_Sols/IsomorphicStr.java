package com.manas.leetco;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStr {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Maps to store character mappings from s to t and t to s
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check if there's an inconsistent mapping from s to t
            if (mapST.containsKey(c1) && mapST.get(c1) != c2) {
                return false;
            }

            // Check if there's an inconsistent mapping from t to s
            if (mapTS.containsKey(c2) && mapTS.get(c2) != c1) {
                return false;
            }

            // Add the mappings
            mapST.put(c1, c2);
            mapTS.put(c2, c1);
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
        IsomorphicStr solution = new IsomorphicStr();
        boolean result = solution.isIsomorphic(s, t);

        // Output the result
        System.out.println("Are the strings isomorphic? " + result);

        scanner.close();
    }
}

