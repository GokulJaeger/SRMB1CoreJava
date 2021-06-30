package com.srm.cjava.week1.day1;

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int j;
        int row;
        int col;
        int sum = 0;
        System.out.println("Enter the number of rows:");
        row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        col = sc.nextInt();

        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];

        System.out.println("Enter the elements of the 1st matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the 2nd matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of matrix1 are");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(mat1[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("The elements of matrix2 are");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(mat2[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\nThe SUM of elements of matrix1 and matrix2 are");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                sum = mat1[i][j] + mat2[i][j];
                System.out.print(sum + "\t");
            }
            System.out.println("");
        }
    }
}
