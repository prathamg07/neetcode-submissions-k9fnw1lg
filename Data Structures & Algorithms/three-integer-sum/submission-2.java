class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        ArrayList <List<Integer>> ans = new ArrayList<>();
        for (int i =0 ; i<nums.length-1 ; i++){
            HashSet <Integer> set = new HashSet <>(); 
            for (int j=i+1;j<nums.length;j++){

                if (set.contains(-(nums[i]+nums[j]))){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(-(nums[i] + nums[j]));
                    Collections.sort(triplet);
                    if (!ans.contains(triplet)){
                        ans.add(triplet);
                    }
                    set.add(nums[j]);
                }
                else{
                    set.add(nums[j]);
                }

            }
        }

        return ans;
        
    }
}
