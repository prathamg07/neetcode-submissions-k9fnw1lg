class Solution {
    public int maxProduct(int[] nums) {

        int[] min_product = new int[nums.length];
        int[] max_product = new int[nums.length];

        min_product[0] = nums[0] ; 
        max_product[0]= nums[0] ;
        int max = nums[0];

        for (int i = 1 ; i < nums.length ; i++){
            min_product[i]= Math.min(Math.min(nums[i] , nums[i]*min_product[i-1]), max_product[i-1]*nums[i]);
            max_product[i]= Math.max(Math.max(nums[i] , nums[i]*min_product[i-1]), max_product[i-1]*nums[i]);

            if (max_product[i] > max ){
                max = max_product[i];
            }

        }



        return max ;

    }
}
