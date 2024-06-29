//26. Remove Duplicates from Sorted Array
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

package DSA.LeetCode;

public class Problem26 {
    static int[] arr={1,1,2};

    public static void main(String[] args) {

        System.out.println(removeDuplicates(arr));
    }

    private static int removeDuplicates(int[] arr) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1 && arr[i]==arr[i+1]){
                    continue;
                }
                else {
                    arr[count]=arr[i];
                    count++;
                }
            }

        return count;
    }
}
