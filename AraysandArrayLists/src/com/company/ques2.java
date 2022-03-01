package com.company;

import java.util.Scanner;

//transpose of a input matrix
public class ques2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows= in.nextInt();
        System.out.println("Enter the number of columns:");
        int cols= in.nextInt();
        int[][] matrix=new int[rows][cols];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                matrix[i][j]=in.nextInt();
            }
        }
        System.out.println("original matrix");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Transpose of this matrix is");
        for (int j = 0; j <rows ; j++) {
            for (int i = 0; i <cols; i++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println(" ");

        }



    }
}
