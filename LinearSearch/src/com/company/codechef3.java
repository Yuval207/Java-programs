package com.company;

import java.util.Scanner;

public class codechef3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int A=in.nextInt();
            int B=in.nextInt();
            int C=in.nextInt();
            int D=in.nextInt();
            int a=0;
            int b=0;
            int maximum=Integer.MIN_VALUE;
            if(maximum < A){
                maximum = A;
            }
            if(maximum < B){
                maximum = B;
            }
            if(maximum < C){
                maximum = C;
            }
            if(maximum < D){
                maximum = D;
            }
            for(int i = 1 ; i <= maximum ; i++){
                for(int j = 1 ; j <= maximum ; j++){
                    if(A == i*j || B == i*j || C == i*j || D == i*j){
                        if(A == i+j || B == i+j || C == i+j || D == i+j){
                            if(A == i-j || B == i-j || C == i-j || D == i-j){
                                if(A == i/j || B == i/j || C == i/j || D == i/j){
                                    a = i;
                                    b = j;

                                }
                            }
                        }
                    }
                    else{
                        a=-1;
                        b=-1;
                    }
                }
            }
            System.out.print(a+" ");
            System.out.println(b);
            t--;
        }
    }
}
