package com.dsa.takeUForward.Practice.problems.Searching;

import java.util.ArrayList;
import java.util.Arrays;

/*Algorithm -1: Using Linear Search
* First We will declare two variables, first (to store first instance) and last (to store last occurrence) and intialize with -1
* Start Traversing Loop
* When we first encounter the element k in the array , we will store the index in the First and Last Variables
* But for the Next Occurrences we will not update the first instead we will only update the last variable with current index
* */
public class FirstAndLastOccurence {
    public static void main(String[] args) {

        ArrayList<Integer> arrList=new ArrayList<>(Arrays.asList(new Integer[]{2,4,6,8,8,8,11,13}));
        int element=8;
        int[] ans=firstAndLastPosition(arrList,element);
        System.out.println("The First and Last Position "+ans[0]+" "+ans[1]);

    }

    static int[] firstAndLastPosition(ArrayList<Integer> arrList, int element) {
        int first=-1,last=-1;
        for(int i=0;i<arrList.size();i++){
            if(arrList.get(i)==element){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        return new int[]{first,last};
    }
}
