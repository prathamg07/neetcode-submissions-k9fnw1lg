class Solution {
    public boolean validPalindrome(String s) {
        int count =0;
        int end=s.length()-1;

        for (int i =0 ; i< s.length()/2; i++){
            if (s.charAt(i)!=s.charAt(end)){
                int end1=end-1;
                int j=i;

                while (j<end1){

                    if (s.charAt(j)!=s.charAt(end1)){
                        count++;
                        break;
                    }
                    j++;
                    end1--;
                }

                if (count==1){

                    j=i+1;
                    while (j<end){

                    if (s.charAt(j)!=s.charAt(end)){
                        return false;
                    }

                    j++;
                    end--;
                }}

                else{
                    return true;
                }

                    
                
                
            }
            end--;
        }

        return true;       
    }
}