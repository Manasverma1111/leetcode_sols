package com.manas.leetco;

import java.util.Scanner;

public class MiddleLinkedList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes in the linked list:");
        int n = scanner.nextInt();

        System.out.print("Enter the values of the linked list:");
        ListNode head = null, tail = null;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        MiddleLinkedList solution = new MiddleLinkedList();
        ListNode middleNode = solution.middleNode(head);

        System.out.print("The list starting from the middle node is:");
        solution.printListFromNode(middleNode);

        scanner.close();
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public void printListFromNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}