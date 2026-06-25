class Solution {
    public boolean isPalindrome(String s) {

        int start=0;
        int end=s.length()-1;


        while (end > start){
            while (start <end && s.charAt(start)<48 ||s.charAt(start)>57 &s.charAt(start)<65||s.charAt(start)>90 & s.charAt(start)<97 || s.charAt(start)>122 ){
                start++;
            }
            while (end > start && s.charAt(start)<48 ||s.charAt(start)>57 & s.charAt(end)<65||s.charAt(end)>90 & s.charAt(end)<97 || s.charAt(end)>122){
                end--;
            }

            if (end<= start){
                break;
            }

            System.out.println(s.charAt(start));
            System.out.println(s.charAt(end));

            if (Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            else{
                start++;
                end--;
            }


        }

        return true;
        
    }
}
