//27. Remove Element
/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
The remaining elements of nums are not important as well as the size of nums.
Return k.
* */

package DSA.LeetCode;

import java.util.Scanner;

public class Problem27 {
    static int[] arr={3,2,2,3};
    static int val;
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter elements of array you want to remove: ");
        val=sc.nextInt();

        System.out.println( removeElement(arr,val));


    }


    private static int removeElement(int[] arr, int val) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=val) {
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }


}
