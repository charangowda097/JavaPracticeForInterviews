package com.dsa.takeUForward.Practice.problems.Searching;

/*
* Lower Bound Algorithm helps us  find the first or the smallest Index in the Sorted Array ,where the value at the
* index is greater than or equal to a given key x
* The Lower bound is the smallest index where the arr[ind]>=x , but if any such index is not found, the lower
* bound algorithm returns the 'n' i.e. Size of the Given Array
* */
public class LowerBoundExample {
    public static void main(String[] args) {
        int arr1[]={3,5,8,15,19};
        int val=9;
        int ind=lowerBoundUsingLinearSearch(arr1,val);
        System.out.println("The Lower Bound Index Using Linear Search:"+ind);
        int indexBinary=lowerBoundUsingBinarySearch(arr1,val);
        System.out.println("The Lower Bound Index Using Binary Search:"+indexBinary);

    }

   static int lowerBoundUsingBinarySearch(int[] arr1, int val) {
        int low=0;
        int high=arr1.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr1[mid]>=val){
                return mid;
            }
            else if (val<arr1[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return arr1.length;
    }

    private static int lowerBoundUsingLinearSearch(int[] arr1, int val) {
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>=val){
               return i;
            }
        }
        return arr1.length;
    }
}
