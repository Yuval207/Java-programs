package com.company;

public class MaxWealth {
    public static void main(String[] args) {
        int acc[][]={
                {1,2,321},
                {12,14,154},
                {142,124,10}
        };
        System.out.println(maximumWealth(acc));

    }
      static int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
