package DSA.Array.twoDimensional;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoDArray = new int[10][10];
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter length of two dimensional(col): ");
        int col = sc.nextInt();
        System.out.print("Enter length of two dimensional(row): ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element " + (i + 1) + "th element " + (j + 1) + "th element: ");
                twoDArray[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
