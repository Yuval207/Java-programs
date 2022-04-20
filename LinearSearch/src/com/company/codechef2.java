package com.company;

import java.util.Scanner;

public class codechef2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();

        while(t>0){
            int count=0;
            int N=in.nextInt();
            int[] D=new int[N];
            int[] S=new int[N];
            for(int i=0;i<N;i++){
                D[i]=in.nextInt();



            }
            for(int i=0;i<N;i++){
                S[i]=in.nextInt();
            }
            for(int i=0;i<N;i++){
                if(D[i]==S[i]){
                    count++;
                }

            }
            System.out.println(count);
            t--;

        }
    }
}
