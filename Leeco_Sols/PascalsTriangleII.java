package com.manas.leetco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        long value = 1;

        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) value);
            value = value*(rowIndex - i)/(i + 1);
        }

        return row;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row Index: ");
        int rowIndex = input.nextInt();

        if (rowIndex < 0) {
            System.out.println("Enter a non negative rowIndex: ");
            return;
        }

        PascalsTriangleII res = new PascalsTriangleII();
        List<Integer> row = res.getRow(rowIndex);
        System.out.print("Row" + rowIndex + row);
        input.close();
    }
}
