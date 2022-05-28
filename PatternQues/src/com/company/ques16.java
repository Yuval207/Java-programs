package com.company;

import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int rows=in.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int spaces = 0; spaces<=rows-i ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                if(j==1 || j==i){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print((j+i)/2+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
