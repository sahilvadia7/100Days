package DSA.Array;

import java.util.Scanner;

public class Test1 {
    static int[] a = new int[10];
    static int capacity = a.length;
    static int arrayUse;
    static int newData = 33;
    static int position;
    static int newData2;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        arrayUse = sc.nextInt();

        for (int i = 0; i < arrayUse; i++) {
            System.out.print("Enter element: ");
            a[i] = sc.nextInt();
        }

        printArray(a);


        int obj = insertArrays(a,arrayUse,capacity,newData);
        printArray(a,obj);


        System.out.println("\nEnter new value:  ");
        newData2 = sc.nextInt();

        System.out.println("Enter position: ");
        position = sc.nextInt();
        insertInBetween(a,arrayUse,newData2,position);
        arrayUse +=1;
        printArray(a,arrayUse);

    }


    //allow add data between the array
    private static void insertInBetween(int[] a, int arrayUse, int newData2, int position) {
        for (int i = arrayUse; i < position-1; i--) {
            a[i] = a[i+1];
        }
        a[position] = newData2;
    }


    //allow add data at end of the array
    private static int insertArrays(int[] a, int arrayUse, int capacity, int newData) {
        if (arrayUse>capacity) {
            return arrayUse;
        }
        a[arrayUse] = newData;
        return (arrayUse + 1);
    }


    private static void printArray(int[] a) {
        System.out.println("Printing array: ");
        for (int i = 0; i < arrayUse; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void printArray(int[] a, int obj) {
        System.out.println("\nAdd element at end of array");
        for (int i = 0; i < obj; i++) {
            System.out.print(a[i] + " ");
        }
    }


}
