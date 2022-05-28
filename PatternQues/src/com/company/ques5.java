package com.company;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int rows=in.nextInt();
        for (int i = 1; i<=rows ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
        for (int i = rows-1; i>0 ; i--) {
            for (int j =1; j<=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
