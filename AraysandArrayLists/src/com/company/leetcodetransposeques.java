package com.company;

import java.util.Arrays;

public class leetcodetransposeques {
    public static void main(String[] args) {
        int[][] arr={
                {1,2},
                {4,5},
                {7,8}

        };
        int[][] trans=transpose(arr);
        for (int[] a :trans) {
            System.out.println(Arrays.toString(a));
        };

    }
    static int[][] transpose(int[][] matrix) {
        int[][] ans =new int[matrix[0].length][matrix.length];
        for(int i=0;i< matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
}
