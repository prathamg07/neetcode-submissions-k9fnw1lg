class Solution {

    
    public boolean check (int k , int h , int [] piles){
            int hours = 0;
            for (int key : piles){
                hours += (key + k - 1) / k;
            }

            if (hours <= h){
                return true;
            }
            else{
                return false;
            }
        }
    public int minEatingSpeed(int[] piles, int h) {


        int large=0;
        for (int key : piles){
            if (key > large){
                large = key;
            }
        }

        int low = 1;
        int high = large;

        while (low <= high){
            int k = low + (high - low )/2;

            System.out.println(k);

            if (check(k,h,piles)){
                high = k-1;
            }
            else{
                low = k+1;
            }
        }

        return low;



        
    }
}
