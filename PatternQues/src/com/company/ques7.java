package com.company;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int rows=in.nextInt();
        for (int i =rows; i>0 ; i--) {
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
