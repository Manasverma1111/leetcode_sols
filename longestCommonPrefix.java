import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = {"flower", "floor", "float"};
//        String strs[] = {"racecar", "flower", "bike"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String strs[]) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;
        while (index < first.length()) {
            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : first.substring(0, index);
    }
}
