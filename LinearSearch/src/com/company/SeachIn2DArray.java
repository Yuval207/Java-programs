package com.company;

import java.util.Arrays;

public class SeachIn2DArray {
    public static void main(String[] args) {
        int arr[][]={
                {1212,34,48,65,52},
                {71,454,123,999,454,88},
                {6,12,0,-3,54}
        };
        int target=12;
        int []ans=search(arr,target);
        System.out.println(Arrays.toString(ans)) ;
        System.out.println("Max value of this array is:");
        System.out.println(max(arr));

    }
    static int[] search(int[][] ar,int a){
        for (int row = 0; row <ar.length; row++) {
            for (int col = 0; col <ar[row].length; col++) {
                if(ar[row][col]==a){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] ar){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row <ar.length; row++) {
            for (int col = 0; col <ar[row].length; col++) {
                if(ar[row][col]>max){
                    max=ar[row][col];
                }
            }
        }
        return max;
    }
}
