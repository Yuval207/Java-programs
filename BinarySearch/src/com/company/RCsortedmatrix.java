package com.company;

import java.util.*;

public class RCsortedmatrix {
    public static void main(String[] args) {
        int[][] ar = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(ar, 49)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}

