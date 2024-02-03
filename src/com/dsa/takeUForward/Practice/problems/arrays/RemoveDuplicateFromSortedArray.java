package com.dsa.takeUForward.Practice.problems.arrays;

import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3,3};
        int arr1[]={1,1,1,2,2,2,3,3,3,3};
        int k=removeDuplicatesUsingHashSet(arr);
        System.out.println("The Array after Removing Duplicate Elements:");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }

        int result=removeDuplicatesUsingTwoPointer(arr1);
        for(int i=0;i<result;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeDuplicatesUsingTwoPointer(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    static int removeDuplicatesUsingHashSet(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int k=hs.size();
        int j=0;
        for(int i:hs){
            arr[j++]=i;
        }
        return k;
    }
}
