package DSA.Array.LeetCode;

import java.util.Scanner;

/*
here we find addition in array which use desired
if array has : 1,2,3,4,5
user enter 5 it means addition of two array element is 5
here use lifo method by Default
like 5 is addition of 2,3 also 1,4
but here 2,3 consider only
*/


public class Addition2ElementWithFun {
    static int[] arr = new int[10];
    static int[] arr1 = new int[2];
    static int desired,addition,length;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter array length: ");
        length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter 2-Element Addition desired from array: ");
        desired = sc.nextInt();

        addition2Element(arr,arr1,desired);
        printDesiredAns(arr1);




    }

    private static void printDesiredAns(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    private static void addition2Element(int[] arr, int[] arr1, int desired) {
        for(int i = 0; i < length; i++) {
            for(int j = i+1; j < length; j++) {
                addition= arr[i] + arr[j];
//                System.out.println(addition);
                if(addition == desired) {
                    arr1[0] = i;
                    arr1[1] = j;


                }

            }
        }
    }




}

