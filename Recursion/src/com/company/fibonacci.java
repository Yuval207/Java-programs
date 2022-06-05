package com.company;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the end term for the sequence:");
        int n= in.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
