import java.util.Scanner;
import java.util.*;

class LstNode {
    int val;
    LstNode next;
    LstNode(int x) { val = x; }
}

public class add2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number as a linked list
        System.out.println("Enter the first list (digits separated by space):");
        LstNode l1 = createLinkedList(scanner.nextLine().trim().split(" "));

        // Read the second number as a linked list
        System.out.println("Enter the second list (digits separated by space):");
        LstNode l2 = createLinkedList(scanner.nextLine().trim().split(" "));

        // Create a Solution object and use the addTwoNumbers method
        addtwoNumbers solution = new addtwoNumbers();
        LstNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        System.out.println("The sum is:");
        printLinkedList(result);

        scanner.close();
    }

    // Helper method to create a linked list from a string array of digits
    private static LstNode createLinkedList(String[] digits) {
        LstNode head = new LstNode(0);
        LstNode curr = head;
        for (String digit : digits) {
            curr.next = new LstNode(Integer.parseInt(digit));
            curr = curr.next;
        }
        return head.next;
    }

    // Helper method to print a linked list
    private static void printLinkedList(LstNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}

class addtwoNumbers {
    public LstNode addTwoNumbers(LstNode l1, LstNode l2) {
        LstNode temp = new LstNode(0);
        LstNode curr = temp;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            LstNode node = new LstNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        return temp.next;
    }
}
