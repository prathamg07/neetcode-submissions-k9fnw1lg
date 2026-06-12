class Solution {
    public void sortColors(int[] nums) {
        
        HashMap<Integer,Integer> maps = new HashMap <>();

        for (int num : nums){
            maps.put(num, maps.getOrDefault(num,0)+1);
        }

        for (int key:maps.keySet()){
            System.out.println(key +"  "+ maps.get(key));
        }

        boolean v1=true , v2=true , v3 = true;

        if (maps.containsKey(0)){ v1=false;}
        if (maps.containsKey(1)){ v2=false;}        
        if (maps.containsKey(2)){ v3=false;}
        int n=0;

        do{
            for (int key : maps.keySet()){
                if (key==0 && !v1){

                    for (int i=0;i<maps.get(key);i++){
                        nums[n]=key;
                        n++;
                    }
                    v1 = true;


                }

                else if (key ==1 && !v2 && v1){
                    
                    for (int i=0;i<maps.get(key);i++){
                        nums[n]=key;
                        n++;
                        v2=true;
                    }

                }

                else if (key ==2 && !v3 && v2){

                    
                    for (int i=0;i<maps.get(key);i++){
                        nums[n]=key;
                        n++;
                        v3=true;
                    }

                }

            } 
        }
        while(!v1 || !v2 || !v3) ;


    }
}