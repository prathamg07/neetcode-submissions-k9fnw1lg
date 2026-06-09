class Solution {
    public String longestCommonPrefix(String[] strs) {         
            String temp="";
            for (int k=0 ;k< strs[0].length() ; k++){
                char a = strs[0].charAt(k);
                int found =0;            
                for ( int i =0 ; i<strs.length ;i++){
                    try{
                        if (strs[i].charAt(k) != a){
                            found =1;
                            break;
                        }
                    }
                    catch (Exception e){
                        found=1;
                        break;
                    }}

                if (found==1){
                    break;
                }
                else{
                    temp+=a;
                }
            }


        
         return temp;
    }
}
