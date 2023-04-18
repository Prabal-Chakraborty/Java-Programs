package com.Prabal.Data_Structures_And_Algorithms.Linked_List;

public class CircularLinkedList {
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private  Node tail;
    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void display(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.value+"-> ");
                node = node.next;
            }while (node != head);
        }
        System.out.println("HEAD");
    }
    public void insert(int value){
        Node node = new Node(value);

        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail =node;
    }
}
