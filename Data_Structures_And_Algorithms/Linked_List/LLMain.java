package com.Prabal.Data_Structures_And_Algorithms.Linked_List;

import java.util.Scanner;

public class LLMain {
    public static void main(String[] args) {
        SinglyLinkedList list  = new SinglyLinkedList();

//        list.insertAtLast(1);
//        list.insertAtFirst(2);
//        list.insertAtFirst(3);
//        list.insertAtFirst(4);
//        list.insertAtFirst(5);
////        list.display();
//////        System.out.println();
////        System.out.println(" ---------------------------------------------------------");
////        list.insertAtLast(420);
////        list.display();
//////        System.out.println();
////        System.out.println(" ---------------------------------------------------------");
////        list.insertAtGivenPosition(500,3);
////        list.display();
////        list.deleteFirst();
////        list.display();
////        list.deleteLast();
////        System.out.println(list.deleteFirst()); // to see which value is deleted
////        list.display();
//        list.deleteFromAParticularPosition(3);
//        list.display();

  DoublyLinkedList list2 = new DoublyLinkedList();
//        list2.insertFirst(12);
//        list2.insertFirst(13);
//        list2.insertFirst(14);
//        list2.insertFirst(15);
//        list2.display();
//        list2.insertLast(100);
//        list2.display();
//        list2.insertAfter(15,16);
//        list2.display();
//        list2.ReversedLinkedList();
   CircularLinkedList list3 = new CircularLinkedList();
        list3.insert(10);
        list3.insert(12);
        list3.insert(14);
        list3.insert(16);
        list3.insert(18);
        list3.display();


    }
}
