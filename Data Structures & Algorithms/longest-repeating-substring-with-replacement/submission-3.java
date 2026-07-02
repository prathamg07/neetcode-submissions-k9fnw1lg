class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0 ;
        HashMap <Character , Integer > map = new HashMap <>();
        int length = 0 ;

        int max=0;
        int right =0;
        int max_window=0;

        for (right =0 ; right < s.length() ; right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);


            for (int key : map.values()){
                if (key > max){
                    max = key;
                }
            }

            System.out.println(right +"   "+ left +"   "+max);
            while ((right-left +1)-max > k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }

            if ((right - left)+1 > max_window ){
                max_window = right - left+1;
            }

            
        
        
    }
    return max_window;
    }

}
