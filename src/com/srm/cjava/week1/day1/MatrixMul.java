package week1.day1;

import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        int i;
        int j;
        int m;
        int n;
        int p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for 1st matrix");
        m = sc.nextInt();
        n = sc.nextInt();
        int mat1[][] = new int[m][n];
        System.out.println("Enter the elements of the 1st matrix");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }

        }
        // no of col of 1st mat = no of rows of 2nd mat
        System.out.println("Enter the number of columns for 2nd matrix(rows = col of 1st matrix)");
        p = sc.nextInt();
        int mat2[][] = new int[n][p];
        System.out.println("Enter the elements of the 2nd matrix");
        for (i = 0; i < n; i++) {
            for (j = 0; j < p; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 1st matrix");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(mat1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The 2nd matrix");
        for (i = 0; i < n; i++) {
            for (j = 0; j < p; j++) {
                System.out.print(mat2[i][j] + "\t");
            }
            System.out.println();
        }

        multiply(mat1, mat2, m, n, p);
    }

    static void multiply(int mat1[][], int mat2[][], int m, int n, int p) {
        int mul[][] = new int[m][p];
        int i, j, k;
        for (i = 0; i < m; i++) {
            for (j = 0; j < p; j++) {
                mul[i][j] = 0;
                for (k = 0; k < n; k++) {
                    mul[i][j] = mul[i][j] + mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("The resultant matrix formed on multiplying the two matrices\n");
        for (i = 0; i < m; i++) {
            for (j = 0; j < p; j++) {
                System.out.print(mul[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
