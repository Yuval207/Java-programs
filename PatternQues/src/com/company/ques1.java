package com.company;

import java.util.Scanner;

//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class ques1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int rows=in.nextInt();
        System.out.println("Enter the columns for the pattern:");
        int cols=in.nextInt();
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
