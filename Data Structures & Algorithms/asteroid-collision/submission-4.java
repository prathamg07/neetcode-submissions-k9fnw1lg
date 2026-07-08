class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        int [] stack = new int [asteroids.length];
        int top=-1;

        for ( int i = 0 ; i<asteroids.length ; i++){
            stack[++top]=asteroids[i];

            while (top>0 && stack[top]<0 && stack[top-1]>0){
                if (stack[top-1]==Math.abs(stack[top])){
                    top-=2;
                }
                else{
                    if (Math.abs(stack[top])>stack[top-1]){
                        stack[top-1]=stack[top];
                        top--;
                    }
                    else{
                        top--;
                    }
                }
            }

        }



        int ans[] = new int[top+1];

        for (int i = 0 ; i< top+1 ; i++){
            ans[i]=stack[i];
        }

        return ans;


        
    }
}