package com.Prabal.PlacementQuestions.LeetCode;
import java.util.*;
//LeetCode Question No 349 --> Intersection Of Two Arrays
public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {

        int[] a = {7,3,9};
        int[] b = {6,3,9,2,9,4};

        System.out.println(Arrays.toString(intersection(a,b)));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set  = new HashSet<>();

        for(int i = 0; i<nums1.length; i++){

            set.add(nums1[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums2.length; i++){

            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        int[] ans = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            ans[i] = list.get(i);
        }


        return ans;
    }
}
