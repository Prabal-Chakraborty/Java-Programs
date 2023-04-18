package com.Prabal.PlacementQuestions.GFG;
/* https://practice.geeksforgeeks.org/problems/2d3fc3651507fc0c6bd1fa43861e0d1c43d4b8a1/1 */
public class MinimumPossibleValue {
    public static void main(String[] args) {
        int[] A = {3,4,6,5};
        int[] B = {2,3,1,6};
        int N = A.length;
       int ans = mivPossVal(N,A,B);
        System.out.println(ans);
    }

    public static int mivPossVal(int n, int[] a, int[] b) {

        long count,StickLength;
        long min = Integer.MAX_VALUE;
        int result = 0;
        int totalSticks = 0;
        for (int i = 0; i <n ; i++) {
            count = b[i];
            StickLength = a[i];

            //check if odd
            if (count % 2 ==1){
                count--;
            }
            if (count>=2){
                min = Math.min(StickLength,min);
            }
            result+= StickLength * count;
            totalSticks+=count;
        }
        if (totalSticks % 4 != 0) {
            result-= 2*min;
        }

        return result;
    }
}
