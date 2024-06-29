package DSA.Array;

import java.util.Scanner;

public class arrayOperation {
 
    static int result,index;
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] found = new int[5];
        int[] foundIndex = new int[5];
        
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        int search;
        

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value at index of " + i + " : ");
            arr[i] = in.nextInt();
        }


        // for (int i = 0; i < 5; i++) {
        //     System.out.print(arr[i] );

        // }
        System.out.println();

        System.out.print("enter value you find in array : ");
        search = in.nextInt();

        for (int j = 0; j < 5; j++) {
            if (arr[j] == search) {
                // result = arr[j];
                // index = j;

            
            } else {
                flag = false;
            }
        }

        if (result!=0) {
            System.out.println("your value found :"+result+" at index of :"+index);

        }
        else{
            System.out.println("value is not present in array");

        }

    }
}
