package com.company;

import java.util.Arrays;

public class leetcodeques1 {
    public static void main(String[] args) {
        int[] digits={1,9,9};
        int len=digits.length;
        int last=digits[len-1];
        last+=1;
        digits[len-1]=last;
        if(last==10){
            last=0;
            digits[len-2]+=1;
            digits[len-1]=last;

        }
        System.out.println(Arrays.toString(digits));


    }
}
