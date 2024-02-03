package com.dsa.takeUForward.Practice.problems.Searching;

import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr={10,46,89,6378,97,93,100};
        System.out.println("Enter the Element to be Searched from the Array:");
        int searchItem=scan.nextInt();
        findElementUsingLinerSearch(arr,searchItem);
    }

    static void findElementUsingLinerSearch(int[] arr,int value) {

        boolean result=false;
        int indexNumber=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                indexNumber=i;
                result=true;
                break;
            }
        }
        if(result){
            System.out.println("Element Found at Position:"+indexNumber);
        }
        else{
            System.out.println("Element Not Found");
        }
    }

}
