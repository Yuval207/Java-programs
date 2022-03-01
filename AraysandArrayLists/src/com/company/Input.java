package com.company;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=1;
        arr[2]=1;
        arr[3]=1;
        arr[4]=1;
        System.out.println(arr[0]);
        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //for each loop or enhanced for loop
        System.out.println(" ");
        for (int j : arr) {//for every element in the array , print the element
            System.out.print(j+" ");//here j represent the element in the array
        }
        //another method to print
        //System.out.println(Arrays.toString(arr));

    }
}

