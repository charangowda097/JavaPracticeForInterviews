package com.dsa.takeUForward.Practice.problems.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] inputArray={23,12,90,36,56,784,234,8990};
        Arrays.sort(inputArray);
        for(int i=0;i<inputArray.length-1;i++){
            System.out.print(inputArray[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the Element to be Searched:");
        int element=scan.nextInt();

        binarySearchFunction(inputArray,element);


    }

   static void binarySearchFunction(int[] inputArray, int element) {
        int low=0;
        int high=inputArray.length-1;
        boolean status=false;
        int index=0;

        while (low<=high){
            int mid=(low+high)/2;
            if(inputArray[mid]==element){
                status=true;
                index=mid;
                break;
            } else if (element<inputArray[mid]) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        if (status){
            System.out.println("Element Found at Index Position:"+index);
        }
        else {
            System.out.println("Element Not Found");
        }

    }
}
