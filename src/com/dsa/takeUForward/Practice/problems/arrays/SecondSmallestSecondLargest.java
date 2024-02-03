package com.dsa.takeUForward.Practice.problems.arrays;

import java.util.Arrays;

//Given an Array find the Smallest and Second-Largest Element in the Array,
// Print -1 in the event that either of them doesn't exist
public class SecondSmallestSecondLargest {
    public static void main(String[] args) {

        /*Approach-1 Sort the Array in Ascending Order and print element present at Second element as small and
        second index element from the end is second-largest element*/
        int arr[]={1,89,98,87,9087,307};
        getElements(arr,arr.length);
        /* Time Complexity:O(n*log(n)) */

        /*Approach-2 Sorting the Array Increases the time complexity ,
         hence we need to find the solution without sorting*/
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        System.out.println(small);
        System.out.println(large);


    }

    private static void getElements(int[] arr, int length) {
        if(length==0||length==1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        System.out.println("Second Smallest Element is:"+arr[1]);
        System.out.println("Second Largest Element is:"+arr[arr.length-2]);
    }
}
