import java.util.Scanner;

class firstOccurenceIndex {
    public int strStr(String haystack, String needle) {
        int haylength = haystack.length();
        int needlelength = needle.length();
        if (haylength < needlelength)
            return -1;
        for (int i = 0; i <= haylength - needlelength; i++) {
            int j = 0;
            while (j < needlelength && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needlelength) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the haystack string:");
        String haystack = scanner.nextLine();

        System.out.println("Enter the needle string:");
        String needle = scanner.nextLine();

        firstOccurenceIndex solution = new firstOccurenceIndex();
        int result = solution.strStr(haystack, needle);

        System.out.println("The index of the first occurrence of needle in haystack is: " + result);
    }
}
