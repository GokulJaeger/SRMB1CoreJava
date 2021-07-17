package week1.day1;

import java.util.Scanner;

public class MatrixInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int j;
        int r;
        int c;
        int temp;
        System.out.println("Enter the number of rows:");
        r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        c = sc.nextInt();

        int[][] mat = new int[r][c];

        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the matrix");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }

        // To find transpose

        for (i = 0; i < r; i++) {
            for (j = 0; j < i; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        System.out.println("The transpose of the matrix is :- ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
