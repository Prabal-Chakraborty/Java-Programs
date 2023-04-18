package com.Prabal.Recursions.Basics;

import java.util.ArrayList;

public class FindIndices {
    public static void main(String[] args) {
        int [] arr = {1,3,5,4,8,9};
//        findIndices(arr,4,0);
//        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndices(int [] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            FindIndices.list.add(index);
        }
         findIndices (arr, target, index+1, list);

    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
    }

