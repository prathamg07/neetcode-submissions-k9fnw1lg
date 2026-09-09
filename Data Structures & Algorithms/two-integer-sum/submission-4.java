class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left ; 
        int[] ans = new int [2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0 ; i<nums.length ; i++){
            map.put(nums[i],i);
        }

        for (int i =0 ; i <nums.length ; i++){
            if (map.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=map.get(target - nums[i]);
                if (ans[1]==i){
                    continue;
                }
                break ; 
            }
        }



    return ans;   
    }

}
