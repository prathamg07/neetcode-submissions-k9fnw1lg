class Solution {

    int [] index ;

    int helper (int[] nums ,int start ,int num){

        if (num <= start ){
            return 0 ;
        }

        if (index[num]!= 0 ){
            return index[num];
        }

        int left = helper( nums,start , num-1);
        int right = helper ( nums ,start , num -2)+nums[num-1];

        return index[num] = Math.max(left , right);

    }
    public int rob(int[] nums) {

        if (nums.length ==1){
            return nums[0];
        }

        index = new int[nums.length + 1];
        int left = helper(nums, 0, nums.length - 1); 
        index = new int[nums.length + 1]; 
        int right = helper(nums, 1, nums.length); 
        return Math.max(left, right);
        
    }
}