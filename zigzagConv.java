import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class zigzagConv {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int idx = 0, d = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        for (char c : s.toCharArray()) {
            rows[idx].add(c);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }

        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Creating an instance of Solution class and calling the convert method
        zigzagConv solution = new zigzagConv();
        String result = solution.convert(s, numRows);

        // Displaying the result
        System.out.println("Converted string: " + result);
    }
}

