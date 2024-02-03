package com.dsa.takeUForward.Practice.problems.Searching;
/*
* Upper Bound algorithm finds the first or the smallest index in a sorted array where the value at that index is
* greater than the given key x
* The Upper Bound is the smallest index, where arr[ind]>x, if any such index is not found the Upper Bound Algorithm
* returns the Size of the Array.
* */
public class UpperBoundExample {
    public static void main(String[] args) {
        int arr1[]={3,5,8,9,15,19};
        int x=9;
        int index=upperBoundUsingLinearSearch(arr1,x);
        System.out.println("Upper Bound using Linear Search Algorithm:"+index);
        int binaryIndex=upperBoundUsingBinarySearch(arr1,x);
        System.out.println("Upper Bound using Binary Search Algorithm:"+index);
    }

    static int upperBoundUsingBinarySearch(int[] arr1, int x) {
        int low=0;
        int high=arr1.length-1;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr1[mid]>x){
               return mid;
           } else if (x<arr1[mid]) {
             high=mid-1;
           }
           else {
               low=mid+1;
        }
        }
      return arr1.length;
    }

    static int upperBoundUsingLinearSearch(int[] arr1, int x) {
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>x){
                return i;
            }
        }
        return arr1.length;
    }
}
