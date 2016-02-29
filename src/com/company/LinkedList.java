package com.company;

import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * Created by CalvinKwan on 2/28/2016.
 */
public class LinkedList
{
    public int millionsSold;

    public LinkedList next;

    public LinkedList(int millionsSold)
    {
        this.millionsSold = millionsSold;
    }

    public void display()
    {
        System.out.println(millionsSold);
    }


    public static void main(String[] args)
    {
        linkList theLinkedList = new linkList();
        theLinkedList.insertFirstLink(10);
        theLinkedList.insertFirstLink(9);
        theLinkedList.insertFirstLink(8);
        theLinkedList.insertFirstLink(7);
        theLinkedList.insertFirstLink(6);
        theLinkedList.insertFirstLink(5);
        theLinkedList.insertFirstLink(4);
        theLinkedList.insertFirstLink(3);
        theLinkedList.insertFirstLink(2);
        theLinkedList.insertFirstLink(1);

        theLinkedList.reverse();

        theLinkedList.display();
    }
}

class linkList
{
    public LinkedList firstlink;

    linkList()
    {
        firstlink = null;
    }

    public boolean isEmpty()
    {
        return (firstlink == null);
    }

    public void insertFirstLink(int millionsSold)
    {
        LinkedList newLink = new LinkedList(millionsSold);        //creates new reference to new node

        newLink.next = firstlink;            //appends previous first node as second node
        firstlink = newLink;                //makes the firstlink point to new first node

    }

    public LinkedList removeFirst()
    {
        LinkedList linkReference = firstlink;

        if(!isEmpty())
        {
            firstlink = firstlink.next;
        }
        else
        {
            System.out.println("Empty Linkedlist");
        }
        return linkReference;
    }

    public void display()
    {
        LinkedList theLink = firstlink;
        while(theLink != null)
        {
            theLink.display();

            System.out.println("Next Link: " + theLink.next);

            theLink = theLink.next;
            System.out.println();
        }
    }

    public LinkedList find(int milliionsSold)
    {
        LinkedList theLink = firstlink;
        if(!isEmpty())
        {
            while(theLink.millionsSold != milliionsSold)
            {
                if(theLink.next == null)
                {
                    return null;
                }
                else
                {
                    theLink = theLink.next;
                }
            }
        }
        else
        {
            System.out.println("Empty LinkedList");
        }
        return theLink;
    }

    public void reverse()
    {
        reverse(firstlink);
    }

    public void reverse(LinkedList curr)
    {
        System.out.println("did this work");
        if(curr.next != null)
        {
            firstlink = curr;
            return;
        }
        reverse(curr.next);
        LinkedList temp = curr.next;
        temp.next = curr;
        curr.next = null;
    }

}
