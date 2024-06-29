package DSA.Array;

import java.util.Scanner;

public class deleteArray {
    static int[] array = new int[10];
    static int arrayUse,deleteElement,searchElement;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        arrayUse = sc.nextInt();

        for (int i = 0; i < arrayUse; i++) {
            System.out.print("Enter array element: ");
            array[i] = sc.nextInt();
        }

        printArray(array);


        System.out.print("Enter element to be deleted : ");
        deleteElement = sc.nextInt();
        arrayUse = deleteArrayElement(array,deleteElement);

        printArray(array,arrayUse);

    }

    private static int deleteArrayElement(int[] array, int deleteElement) {

        searchElement = searchelement(deleteElement);
//        System.out.println(">>"+searchElement);
        if(searchElement == -1) {
            System.out.println("Element not found");
            System.exit(0);
        }
            for (int i = searchElement; i <arrayUse -1 ; i++) {
                array[i] = array[i+1];
            }
        return arrayUse-1;

    }

    private static int searchelement(int deleteElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteElement) {
                return i;
            }
        }
        return -1;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i< arrayUse; i++) {
            System.out.println(array[i]);
        }
    }

    private static void printArray(int[] array,int arrayUse) {
        for(int i = 0; i< arrayUse; i++) {
            System.out.println(array[i]);
        }
//        System.out.println("array used length: "+(arrayUse-1));
    }
}
