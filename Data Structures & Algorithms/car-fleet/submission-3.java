class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        Stack <Float> stack = new Stack <>();
        int n = position.length;

        int car [][] = new int [n][2];
        float time [] = new float [n];

        for ( int i = 0 ; i < n ;i++){
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }

        Arrays.sort(car, (a,b)-> b[0]-a[0]);
        
        for (int i =0 ; i< n ; i++){
            time[i]=  (float)(target - car[i][0])/car[i][1];
        }

        for (float key : time){
            if (stack.isEmpty()){
                stack.add(key);
            }
            else{
                if (key > stack.peek()){
                    stack.add(key);
                }
            }
        }       

        return stack.size();
        
    }
}
