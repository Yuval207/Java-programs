package com.company;

import java.util.Scanner;

public class ques22 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int rows=in.nextInt();
        for (int i = 1; i <rows ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print((j+i)%2+" ");
            }
            System.out.println();
        }
    }
}
