package com.Prabal.Data_Structures_And_Algorithms.Arrays;
import java.util.*;
public class unique {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,3,2,1};
        int ans = unique(a);
        System.out.println(ans);

    }

    public static int unique(int a[]){

        int ans = 0;
        for (int i = 0; i <a.length ; i++) {
            ans^=a[i];
        }

        return ans;
    }

    public int findUnique(int a[], int n, int k) //GFG
        {
            Arrays.sort(a);
            int i=0,c=0;
            for( i=0;i<n-1;i=i+k)

                if(a[i]==a[i+1])
                    continue;

                else
                {
                    return a[i];
                }

            return a[i];
        }
    }

