package com.company;

import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int rows=in.nextInt();
        int cnt=1;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
}
