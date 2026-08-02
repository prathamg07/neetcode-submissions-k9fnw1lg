class Solution {

    public boolean check (int mid , int days , int [] weights){

        int d=0;
        int sum=0;
        int n=0;
        
        while (n<weights.length ){

            while (n<weights.length && (mid - sum )>=weights[n]){
                sum+=weights[n];
                n++;
            }

            d++;
            sum=0;

        }

        if (d<=days){
            return true;
        }
        else{
            return false;
        }

    }


    public int shipWithinDays(int[] weights, int days) {

        int low=0;
        int high=0;
        for (int key : weights){
            if (low < key){
                low = key;
            }
            high+=key;

        }
        
        while (high >= low ){
            int mid = low + (high - low )/2;

            System.out.println(mid);

            if (check(mid , days , weights) ){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }

        return low;        
    }
}