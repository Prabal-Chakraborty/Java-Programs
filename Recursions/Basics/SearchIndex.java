package com.Prabal.Recursions.Basics;

public class SearchIndex {
    public static void main(String[] args) {
        int [] arr = {1,3,5,4,8,9};
//        System.out.println(find(arr,15,0));
//        System.out.println(findindexNo(arr,8,0));
    }
    /* This method will only give the boolean value, if the element is present then it will return true and if not yhen false */
    static boolean find(int [] arr, int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    static int findindexNo(int [] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findindexNo(arr,target,index+1);
    }

}
