package com.company;

import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int rows=in.nextInt();
        for (int i =1; i<=rows ; i+=2) {
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                if(j==i ){
                    System.out.print("* ");
                }

            System.out.println();
        }
    }
    }
}
