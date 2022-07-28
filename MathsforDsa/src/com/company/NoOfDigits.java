package com.company;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 100;
        int b = 2;
        int digits = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(digits);
    }
}
