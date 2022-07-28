package com.company;

import java.util.Scanner;

public class Oddeven {

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(oddEven(num)){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }

    static boolean oddEven(int n) {

        return ((n & 1) == 1);
    }
}
