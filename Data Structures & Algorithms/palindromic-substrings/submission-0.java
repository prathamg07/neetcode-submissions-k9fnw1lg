class Solution {
    public int countSubstrings(String s) {

        int left = 0 ;
        int right = 0 ; 
        int count = 0 ; 

        while (right < s.length() ){
            int lp = left ;
            int rp = right ;

            while ( lp >= 0 && rp <s.length()){
                if (s.charAt(lp)==s.charAt(rp)){
                    lp--;
                    rp++;
                    count++;
                }
                else{
                    break;
                }
            }

            if (left==right){
                right++ ;
            }
            else{
                left ++;
            }
        }

        return count ;
        
    }
}
