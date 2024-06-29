package DSA.Array.LeetCode;

public class Addition2Elements {
    static int[] nums = {2,7,11,15};
    static int sum,temp,i,j;
    static int[] ans = new int[4];
    static int ansUse =2;


    public static void main(String[] args){

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                temp = nums[i] + nums[j];
//                System.out.println(temp);
                if(temp == 9){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }



            for(int k=0; k<ansUse; k++){
                System.out.print(ans[k]+" ");
            }


    }
}