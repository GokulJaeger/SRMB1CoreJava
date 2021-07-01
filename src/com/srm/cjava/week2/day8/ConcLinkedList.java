package com.srm.cjava.week2.day8;

public class ConcLinkedList {

    public static CustomList concatenateLinkedList(CustomList l1, CustomList l2) {
        CustomList result = new CustomList(-1);
        CustomList p = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 == null) {
            p.next = l2;
        } else if (l2 == null) {
            p.next = l1;
        }
        return result.next;
    }

    static void printList(CustomList node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        CustomList l1 = new CustomList(1);
        l1.next = new CustomList(3);
        l1.next.next = new CustomList(5);
        System.out.println("List1: ");
        printList(l1);

        CustomList l2 = new CustomList(0);
        l2.next = new CustomList(2);
        l2.next.next = new CustomList(4);

        System.out.println("\nList2: ");
        printList(l2);
        CustomList mergedhead = concatenateLinkedList(l1, l2);
        System.out.println("\nConcatenated list: ");
        printList(mergedhead);
    }
}
