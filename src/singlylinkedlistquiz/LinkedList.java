/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlistquiz;

/**
 *
 * @author s5216
 */
public class LinkedList {

    /*  Variables devlaration  */
    protected Node start;
    protected Node end;
    public int size;

    /*  No-argument Constructor  */
    public LinkedList() {
        start = null;
        end = null;
        size = 0;
    }
    
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }  

    /*  Function to insert an element at begining  */
    public void insertAtBeginning(int val) {
        Node newPointer = new Node(val, null);
        size++;
        if (start == null) {
            start = newPointer;
            end = start;
        } else {
            newPointer.setLink(start);
            start = newPointer;
        }
    }

    /*  Function to insert an element at end  */
    public void insertAtEnd(int val) {
        Node newPointer = new Node(val, null);
        size++;
        if (start == null) {
            start = newPointer;
            end = start;
        } else {
            end.setLink(newPointer);
            end = newPointer;
        }
    }

    /*  Function to insert an element at position  */
    public void insertAtAnyPosition(int value, int position) {
        Node newPointer = new Node(value, null);
        Node pointer = start;
        position = position - 1;
        for (int i = 1; i < size; i++) {
            if (i == position) {
                Node temporary = pointer.getLink();
                pointer.setLink(newPointer);
                newPointer.setLink(temporary);
                break;
            }
            pointer = pointer.getLink();
        }
        size++;
    }

    /*  Function to delete an element at position  */
    public void deleteAtPosition(int position) {
        if (position == 1) {
            start = start.getLink();
            size--;
            return;
        }
        if (position == size) {
            Node s = start;
            Node t = start;
            while (s != end) {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size--;
            return;
        }
        Node ptr = start;
        position = position - 1;
        for (int i = 1; i < size - 1; i++) {
            if (i == position) {
                Node temp = ptr.getLink();
                temp = temp.getLink();
                ptr.setLink(temp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }

    /* Function to remove all the elements in linkedlist that is greater than a targeted value */
    public void deleteElementGreaterThanGivenValue(LinkedList list, int value) {
        if (list == null) {
            return;
        }

        Node temp = list.start;
        Node previous = null;
        // If head node itself holds the key or multiple occurrences of key
        while (temp != null && temp.element > value) {
            list.start = temp.link;
            temp = list.start;
        }

        while (temp != null) {
            if (temp.element == value) {
                previous.link = temp.link;
            } else {
                previous = temp;
            }
            temp = temp.link;
        }
    }

    /*  Function to display elements in linkedlist */
    public void display() {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null) {
            System.out.println(start.getElement());
            return;
        }
        Node ptr = start;
        System.out.print(start.getElement() + "->");
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            System.out.print(ptr.getElement() + "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getElement() + "\n");
    }

}
