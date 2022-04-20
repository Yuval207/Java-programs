package com.company;

import java.util.*;

public class arrayListQ1 {
    public static void main(String[] args) {
        int[] can={2,8,7};
        int extra=1;
        System.out.println(kidsWithCandies(can,extra));


    }
    static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
            candies[i]+=extraCandies;
        }
        for (int i = 0; i <candies.length ; i++) {
            if(candies[i]<max){
                list.add(false);
            }
            else{
                list.add(true);
            }

        }
        return list;

    }
}
