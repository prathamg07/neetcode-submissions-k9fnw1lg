class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet <Integer> set = new HashSet<>();
        for (int i =0 ; i< nums.length ; i++){
            set.add(nums[i]);
        }

        int [] arr = new int [nums.length] ;
        int n=0;

        for (int i =0 ; i<nums.length ; i++){
            if (!set.contains(nums[i]-1)){
                arr[n++]=nums[i];
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int max=0;
        

        for (int i=0; i<n;i++){
            int curr=arr[i];
            int freq=0;
            while(set.contains(curr)){
                curr=curr+1;
                freq++;
            }
            if (freq>max){
                max=freq;
            }

        }

        return max;

        
    }
}
