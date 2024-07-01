import java.util.Scanner;

class Solutions {
    int val;
    ListNode next;
    void ListNode(int x) { val = x; }
}

class removeDuplicatefromsortedlist {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input the number of elements in the linked list
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The linked list is empty.");
            return;
        }

        // Input the elements of the linked list
        System.out.print("Enter the elements of the linked list: ");
        ListNode head = new ListNode(scanner.nextInt());
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        removeDuplicatefromsortedlist solution = new removeDuplicatefromsortedlist();
        ListNode result = solution.deleteDuplicates(head);

        // Print the result
        System.out.print("Linked list after removing duplicates: ");
        current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        scanner.close();
    }
}
