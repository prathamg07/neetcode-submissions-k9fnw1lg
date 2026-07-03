class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0 ;
        int right = 0 ;
        int min = 100001 ;
        int sum = 0;

        while (left <= right || right < nums.length){

            if (left <=right && sum >= target){
                sum-=nums[left];
                left++;
                if (right - left +1 < min){
                    min = right - left +1;
                    System.out.println(min);
                }
                continue;
            }

            if (right ==nums.length){
                left++;
                continue;
            }
            sum += nums[right];
            right++;
        }

        if (min == 100001){
            return 0 ;
        }

        return min;
        
    }
}