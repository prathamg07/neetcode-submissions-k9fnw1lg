class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet <Integer> set = new HashSet<>();
        for (int i =0 ; i< nums.length ; i++){
            set.add(nums[i]);
        }
        int max =0;
        for (int num : set){
            if (!set.contains(num-1)){
                int curr=num;
                int freq=0;
                while(set.contains(curr)){
                    curr=curr+1;
                    freq++;
                }
                if (freq>max){
                    max=freq;
                }
            }
        }
        return max;  
    }
}
