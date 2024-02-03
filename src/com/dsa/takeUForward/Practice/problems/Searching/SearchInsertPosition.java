package com.dsa.takeUForward.Practice.problems.Searching;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr1[]={1,2,4,7};
        int valueToInsert=2;
        int position=searchInsertPosition(arr1,valueToInsert);
        System.out.println("Result:"+position);
        int positionUsingBinary=searchInsertPositionUsingBinary(arr1,valueToInsert);
        System.out.println("Result Using Binary Search:"+positionUsingBinary);
    }

    static int searchInsertPositionUsingBinary(int[] arr1, int valueToInsert) {
        int low=0;
        int high=arr1.length-1;
        int index=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr1[mid]>=valueToInsert){
                index=mid;
                break;
            }
            else if(valueToInsert<arr1[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return index;
    }

    static int searchInsertPosition(int[] arr1, int valueToInsert) {
        int index=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>=valueToInsert){
                index=i;
                break;
            }
        }
        return index;
    }
}
