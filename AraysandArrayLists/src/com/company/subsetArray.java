package com.company;

import java.util.Scanner;

public class subsetArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the two arrays:");
        int len = in.nextInt();
        int len2 = in.nextInt();
        int[] arr = new int[len];
        int[] arr2 = new int[len2];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < len ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < len2 ; i++) {
            arr2[i] = in.nextInt();
        }
        int count = 0;
        if(len<len2){
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len2; j++) {
                    if(arr2[j]==arr[i]){
                        count++;
                    }
                }
            }
        }
        else{
            for (int i = 0; i < len2; i++) {
                for (int j = 0; j < len; j++) {
                    if(arr2[j]==arr[i]){
                        count++;
                    }
                }
            }
        }
        if(count==len){
            System.out.println("First array is the subset of the second array");
        }
        else if(count==len2){
            System.out.println("Second array is the subset of the first array");
        }
        else{
            System.out.println("No subset array");
        }
    }
}
