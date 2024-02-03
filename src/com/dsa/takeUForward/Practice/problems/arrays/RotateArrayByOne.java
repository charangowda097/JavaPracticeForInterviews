package com.dsa.takeUForward.Practice.problems.arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr1[]={1,2,3,4,5};
        rotate(arr);
        rotateInPlace(arr1);
    }

    static void rotateInPlace(int[] arr) {
        int temp=arr[0];
        System.out.println();
        System.out.println("Array before Rotation:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println("Array after Rotation:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void rotate(int[] arr) {
        int[] temp=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            temp[i-1]=arr[i];
        }
        temp[arr.length-1]=arr[0];
        System.out.println("Array Elements Before Rotating are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array Elements After Rotating are:");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
