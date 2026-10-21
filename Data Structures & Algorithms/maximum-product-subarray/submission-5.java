class Solution {
    public int maxProduct(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        int ans = max;

        for (int i = 1 ; i < nums.length ; i++){
            int temp1 = min ; 
            int temp2 = max ; 
            min= Math.min(Math.min(nums[i] , nums[i]*temp1), temp2*nums[i]);
            max= Math.max(Math.max(nums[i] , nums[i]*temp1), temp2*nums[i]);

            if (max > ans ){
                ans = max ; 
            }

        }



        return ans;

    }
}