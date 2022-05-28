package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionInaArray {
    public static void main(String[] args) {
        int[] arr= new int[10];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter how many numbers u want to input:");
        int n=in.nextInt();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n ; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the index at which u want to insert the number:");
        int x=in.nextInt();
        System.out.println("Enter the number u want to insert:");
        int y=in.nextInt();
        System.out.println(Arrays.toString(insertion(x,y,arr,10)));
    }

    static int[] insertion(int x,int y, int[] arr,int len) {
        int[] arr2=new int[len+1];
        for (int i = 0; i <arr2.length ; i++) {
            if(i<x){
                arr2[i]=arr[i];
            }
            else if(i==x){
                arr2[i]=y;
            }
            else{
                arr2[i]=arr[i-1];
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr2[i];
        }
        return arr;

    }
}
