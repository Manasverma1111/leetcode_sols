package com.manas.leetco;

import java.util.Scanner;
import com.manas.leetco.ListNode;
public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static ListNode createLinkedList(int[] values, int pos) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleNode = null;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;

            if (i == pos) {
                cycleNode = current;
            }
        }

        if (pos != -1) {
            current.next = cycleNode; // Creating a cycle at the specified position
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for linked list values
        System.out.print("Enter the number of nodes in the linked list: ");
        int n = scanner.nextInt();

        int[] values = new int[n];
        System.out.print("Enter the values of the nodes: ");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        // Taking input for the position to create a cycle
        System.out.print("Enter the position (index) to create a cycle (-1 if no cycle): ");
        int pos = scanner.nextInt();

        ListNode head = createLinkedList(values, pos);

        // Checking if the linked list has a cycle
        boolean hasCycle = hasCycle(head);
        System.out.print("Does the linked list have a cycle? " + hasCycle);

        scanner.close();
    }
}
