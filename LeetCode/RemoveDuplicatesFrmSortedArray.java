package com.Prabal.PlacementQuestions.LeetCode;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/973265574/
//https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=remove-duplicate-elements-from-sorted-array
public class RemoveDuplicatesFrmSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j<nums.length; j++){

            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
