package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n= in.nextInt();
        int[] array=new int[n];
        System.out.println("Enter th elements of the array:");
        for (int i = 0; i <n ; i++) {
            array[i]=in.nextInt();


        }
        for (int i = 0; i < n ; i++) {
            System.out.println(array[i]);
        }
    }
}
