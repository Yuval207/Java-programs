package com.company;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n= in.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter th elements of the array:");
        for (int i = 0; i <n ; i++) {
            ar[i]=in.nextInt();


        }
        boolean sort=true;
        for (int i = 0; i < ar.length-1 ; i++) {
            if (ar[i] > ar[i + 1]) {
                sort = false;
                break;
            }
        }
        if(sort){
            System.out.println("The array is  sorted in ascending order ");
        }
        else{
            System.out.println("The array is not sorted in ascending order");
        }
    }
}
