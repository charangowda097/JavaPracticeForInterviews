package com.dsa.takeUForward.Practice.problems.arrays;

import java.util.Arrays;

public class LargestElementArray {
    public static void main(String[] args) {

        // Approach-1 By Sorting the Array and returning the End Index element
        //Time Complexity is O(N*log(N)) as we have Sorting in Place here
        int arr1[]={10,9,7,3,67,9,0,12};
        System.out.println("The Largest Element in the Array is:"+sort(arr1));

        int arr2[]={67,98,12,34,98,63,64};
        System.out.println("The Largest Element in Array is:"+sort(arr2));

        //Approach-2 By Using Max Variable
        //Time Complexity is O(N) as we have to traverse through the entire Array
        int arr[]={78,89,98,23,46,98765,890,234,123,472};
        int max=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element in the Array is:"+max);
    }

     static int sort(int[] arr1) {
         Arrays.sort(arr1);
         return arr1[arr1.length-1];
    }
}
