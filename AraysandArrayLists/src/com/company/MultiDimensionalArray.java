package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        8 9 11
         */
//        syntax
        Scanner in=new Scanner(System.in);

//        int row= in.nextInt();
//        int col = in.nextInt();
        int[][] arr =new int[3][2];
        int[][] arr2={
                {1,3,5},
                {7,9,13},
                {15,17,19}
        };
        //input

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]= in.nextInt();

            }

        }
        //output
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                System.out.print(arr[i][j] + " ");
//
//            }
//            System.out.println();
//
//        }
//
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//
//        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));

        }



    }

}
