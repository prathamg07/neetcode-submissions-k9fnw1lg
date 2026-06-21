class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap <Integer, Integer > maps = new HashMap<>();
        ArrayList <Integer> list = new ArrayList<>();

        for (int num : nums){
            maps.put(num,maps.getOrDefault(num,0)+1);
            if (maps.size()>2){
                
                int [] remove = new int[3];
                int n=0;
                for (int key : maps.keySet()){
                    maps.put(key,maps.get(key)-1);
                    if (maps.get(key)==0){
                        remove[n++]=key;
                    }
                }               
                for (int i=0 ; i<n;i++){
                        maps.remove(remove[i]);
                    }
                }
            }
            for(int key :maps.keySet()){
                int count = 0;
                for (int num : nums) {
                    if (num == key) {
                        count++;
                    }
                }

                maps.put(key,count);
            }

            for (int key : maps.keySet()){
                if (maps.get(key)> nums.length/3){
                    list.add(key);
                }
            }

            return list;
        }


        
    }
