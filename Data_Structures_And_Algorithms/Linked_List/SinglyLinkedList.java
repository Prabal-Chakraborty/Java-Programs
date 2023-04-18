package com.Prabal.Data_Structures_And_Algorithms.Linked_List;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public SinglyLinkedList(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node  next){
            this.value = value;
            this.next = next;
        }
    }
    /* Code For Insertion */
    public void insertAtFirst(int val){ /* Insert a node in the first position */
        Node node = new Node(val);

        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertAtLast(int val){ /* Insert a node in the last position */
        if (tail == null){
            insertAtFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtGivenPosition(int val, int index){ /* Insert a node in the given  position */
        if (index == 0){
            insertAtFirst(val);
            return;
        }
        if (index == size){
            insertAtLast(val);
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

    public void display(){ /* Display Method */
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    /* Code For Deletion */
    public int deleteFirst(){  /* Delete the node from the first position */
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index){ /* To get the second last reference */
        Node node = head;
        for (int i = 0; i <index ; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){ /* Delete the node from the last position */
        if (size <= 1){
            deleteFirst();
        }
        Node SecondLast  = get(size-2);
        int val = tail.value;
        tail = SecondLast;
        tail.next = null;
        return val;
    }


    public int deleteFromAParticularPosition(int index){ /* Delete the node from the given position or index*/
        if (index == 0 ){
            deleteFirst();
        }
        if (index == size -1){
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next; //here we can get null pointer exception.
        return val;
    }

    /* Return or Find a node of a particular value */
    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

}
