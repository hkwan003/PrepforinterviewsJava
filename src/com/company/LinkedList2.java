package com.company;

/**
 * Created by CalvinKwan on 2/28/2016.
 */
public class LinkedList2
{
    static Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    Node ReverseRecurseive(Node node)           //recursively reverse
    {
        if(node == null)
        {
            return null;
        }
        if(node.next == null)
        {
            return node;
        }
        Node secondElement = node.next;

        node.next = null;
        Node reverseRest = ReverseRecurseive(secondElement);
        secondElement.next = node;

        return reverseRest;
    }

    Node reverse(Node node)         //iteratively reverse
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList2 list = new LinkedList2();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Original Linked list is :");
        list.printList(head);
        head = list.ReverseRecurseive(head);
        System.out.println("");
        System.out.println("Reversed linked list : ");
        list.printList(head);
        System.out.println();
        System.out.println();
        int temp = 5;
        temp = temp << 1;
        System.out.println("shifted temp: " + temp);
    }
}
