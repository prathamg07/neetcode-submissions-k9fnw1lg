class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap <Integer , Integer > maps = new HashMap<>();

        for (int i =0; i<nums.length;i++){
            maps.put(nums[i],maps.getOrDefault(nums[i],0)+1);
        }

        int [] arr = new int [k];
        

        while (k>0){

            int freq=0;
            int pkey=0;

            for (int key : maps.keySet()){

                if (freq<maps.get(key)){
                    pkey=key;
                    freq = maps.get(key);
                }

            }

            maps.remove(pkey);

            arr[k-1]=pkey;

            k--;
        }
        return arr;
    }
}
