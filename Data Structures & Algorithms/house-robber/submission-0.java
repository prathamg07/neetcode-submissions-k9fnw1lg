class Solution {

    int [] index ;

    int helper (int[] nums , int num){

        if (num <= 0 ){
            return 0 ;
        }

        if (index[num]!= 0 ){
            return index[num];
        }

        int left = helper( nums , num-1);
        int right = helper ( nums , num -2)+nums[num-1];

        return index[num] = Math.max(left , right);

    }
    public int rob(int[] nums) {

        index = new int [nums.length+1];

        return  helper(nums , nums.length);
        
    }
}
