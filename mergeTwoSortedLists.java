import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class mergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the first list separated by space:");
        ListNode list1 = createListFromInput(scanner);

        System.out.println("Enter the elements of the second list separated by space:");
        ListNode list2 = createListFromInput(scanner);

        mergeTwoSortedLists solution = new mergeTwoSortedLists();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        System.out.println("Merged list:");
        printList(mergedList);

        scanner.close();
    }

    private static ListNode createListFromInput(Scanner scanner) {
        String[] elements = scanner.nextLine().split(" ");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String element : elements) {
            current.next = new ListNode(Integer.parseInt(element));
            current = current.next;
        }

        return dummy.next;
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
