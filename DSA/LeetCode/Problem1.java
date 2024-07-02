//Two sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.

package DSA.LeetCode;

public class Problem1 {

    static int[] nums={2,7,11,15};
    static int target = 18;
    public static void main(String[] args) {

        int[] data = twoSum(nums,target);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}






