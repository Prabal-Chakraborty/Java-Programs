package com.Prabal.Data_Structures_And_Algorithms.Linked_List.LinkedListQuestions;
//https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
import java.util.LinkedList;
import java.util.Scanner;

public class ListHackerRankQn {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        LinkedList<Integer> list = new LinkedList();
        for(int i = 0; i<size; i++){
            int ele = ip.nextInt();
            list.add(ele);
        }
        int qu = ip.nextInt();
        for(int i=0 ; i<qu; i++){
            String query = ip.next();
            if(query.equals("Insert")){
                int x = ip.nextInt();
                int y = ip.nextInt();
                list.add(x,y);
            }else{
                int ind = ip.nextInt();
                list.remove(ind);
            }
        }

        Object []ansArr = list.toArray();
        for(Object element : ansArr)
            System.out.print(element+" ");

    }
}
