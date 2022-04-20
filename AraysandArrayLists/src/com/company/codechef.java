package com.company;

import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            int N = in.nextInt();
            boolean check = splits(N);
            if (check == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
    static boolean splits(int N){
        int a=0;
        int b=0;
        while(N>0){
            int rem=N%10;
            a=N/10;
            b=b*10+rem;
            N=N/10;
            if((a+b)%2==0){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}