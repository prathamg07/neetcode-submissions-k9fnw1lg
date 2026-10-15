class Solution {
    public String longestPalindrome(String s) {

        int left = 0 ;
        int right = 0 ;
        int max = 0 ;

        int ans_lp = 0 ;
        int ans_rp = 0 ;

        while (right < s.length() ){
            int lp = left ;
            int rp = right ; //decide the center

            while (lp >= 0 && rp < s.length() ){
                if (s.charAt(lp)==s.charAt(rp)){
                    lp--;
                    rp++;
                }
                else{

                    break;
                }
            }

            if ( rp-lp-1 > max){
                max = rp - lp -1 ;
                ans_lp = lp +1 ;
                ans_rp = rp -1 ;
            }

            if (left==right){
                right ++;
            }
            else{
                left++;
            }
        }

        StringBuilder str = new StringBuilder();
        for (int i = ans_lp ; i<= ans_rp ; i++){
            str.append(s.charAt(i));
        }


        return str.toString();


        
    }
}
