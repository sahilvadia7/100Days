package DSA.Array;

import java.util.Scanner;

public class InsertInBetween {


    public static void main(String[] args) {
    int[] arr = new int[10];
    int newData ;
    int ArrayUse;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Array Length : ");
    ArrayUse = sc.nextInt();

    for (int i = 0; i < ArrayUse; i++) {
        System.out.print("Enter element " + (i + 1) + ": ");
        arr[i] = sc.nextInt();
    }

    System.out.print("Enter position to enter new data: ");
    int position = sc.nextInt();

    System.out.print("Enter new data: ");
    newData = sc.nextInt();

    inserBetween(arr,newData,ArrayUse,position);
    ArrayUse +=1;

    for (int i = 0; i < ArrayUse; i++) {
        System.out.println(arr[i]);
    }


    }

    private static void inserBetween(int[] arr, int newdata, int arrayUse, int position) {


            for (int i = arrayUse; i >= position - 1; i--) {
                arr[i + 1] = arr[i];
            }
            arr[position] = newdata;

    }
}
