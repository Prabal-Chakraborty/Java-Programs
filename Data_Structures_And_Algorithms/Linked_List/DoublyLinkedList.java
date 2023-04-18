package com.Prabal.Data_Structures_And_Algorithms.Linked_List;

public class DoublyLinkedList {
    private int size;
    public DoublyLinkedList(){
        this.size = 0;
    }
    private Node head;
    class Node{
        int value;
        Node next;
        Node prev;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }


    public void display(){                     /* Display Method */
        DoublyLinkedList.Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    
    public void insertFirst(int value){      /* Insert a node in the first position */
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node lastNode = head;
        node.next = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

        while (lastNode.next != null){
            lastNode = lastNode.next;
        }

        lastNode.next = node;
        node.prev = lastNode;
    }

    public void insertAtGivenPosition(int val, int index){ /* Insert a node in the given  position */
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;

        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size ++;
    }

    public void insertAfter(int after, int value){
        Node pointerNode = findNode(after);
        if (pointerNode == null){
            System.out.println("The Node is not exist");
            return;
        }
        Node node = new Node(value);
        node.next = pointerNode.next;
        pointerNode.next = node;
        node.prev = pointerNode;
        if (node.next != null){
            node.next.prev = node;
        }
    }

    public Node findNode(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void ReversedLinkedList(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            last = temp;
            temp = temp.next;
        }

        while (last != null){
            System.out.print(last.value +"-> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}
