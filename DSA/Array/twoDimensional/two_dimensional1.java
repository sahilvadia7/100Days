package DSA.Array.twoDimensional;

import java.util.Scanner;

public class two_dimensional1 {
    static int[][] two_dimensional = new int[10][10];
    static Scanner sc = new Scanner(System.in);
    static int size;
    public static void main(String[] args) {


        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element " + (i + 1) + "th element " + (j + 1) + "th element: ");
                two_dimensional[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(two_dimensional[i][j]);
            }
            System.out.println();
        }

        System.out.print("enter find element: ");
        int find = sc.nextInt();

        int[] data = findElement(two_dimensional,find);
        System.out.print("Index of your element: ");

        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");

        }
        System.out.print("]");

    }

    private static int[] findElement(int[][] two_dimensional, int i) {
        for (int j = 0; j < size; j++) {
            for (int k =0; k < size; k++) {
                if (two_dimensional[j][k] == i) {
                    return new int[]{j,k};

                }
            }
        }
        return null;
    }


}
