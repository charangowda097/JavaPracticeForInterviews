package com.dsa.takeUForward.Practice.problems.Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOccurrenceExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{2,4,6,8,8,8,11,13}));
        int element=8;
        int[] ans=firstAndLastPosition(arr,arr.size(),element);
        System.out.println("The First Occurrence of the element is:" +ans[0]+
                " and Second Occurrence of the element is:"+ans[1]);
    }

    static int[] firstAndLastPosition(ArrayList<Integer> arr, int size, int element) {
        int lb=lowerBound(arr,size,element);
        if(lb==size||arr.get(lb)!=element){
            return new int[] {-1,-1};
        }
        int ub=upperBound(arr,size,element);
        return new int[] {lb,ub-1};
    }

   static int upperBound(ArrayList<Integer> arr, int size, int element) {
        int low=0;
        int high=size-1;

        int ans=size;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)>element){
                ans=mid;
                break;
            }
            else if (element<arr.get(mid)){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
       }
        return ans;
    }

    static int lowerBound(ArrayList<Integer> arr, int size, int element) {
        int low=0;
        int high=size-1;
        int ans=size;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr.get(mid)>=element){
               ans=mid;
               break;
            }
            else if(element<arr.get(mid)){
             high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
