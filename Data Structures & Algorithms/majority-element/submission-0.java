class Solution {
    public int majorityElement(int[] nums) {

        HashMap <Integer , Integer>maps = new HashMap<>();

        for (int i=0; i<nums.length;i++){
            maps.put(nums[i],maps.getOrDefault(nums[i],0)+1);
        }

        int freq=0;
        int num=0;
        
        for (int key : maps.keySet()){
            if (maps.get(key) >freq){
                freq=maps.get(key);
                num = key;
            }
        }

        return num;
        
    }
}