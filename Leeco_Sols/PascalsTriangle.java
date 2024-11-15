package com.manas.leetco;

import java.util.*;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> currRow = new ArrayList<>();
            long value = 1;

            for (int j = 0; j <= i; j++) {
                currRow.add((int) value);
                value = value*(i - j)/(j + 1);
            }

            result.add(currRow);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pascal triangle: ");
        int numRows = input.nextInt();

        List<List<Integer>> triangle = generate(numRows);

        System.out.println("Pascal's triangle: ");

        for (List<Integer> i : triangle) {
            System.out.println(i);
        }
        input.close();
    }
}
