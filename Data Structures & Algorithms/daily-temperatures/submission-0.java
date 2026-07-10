class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack <Integer> stack = new Stack<>();
        Stack <Integer> index = new Stack<>();

        int [] result = new int [temperatures.length];

        for(int i=0 ; i< temperatures.length ; i++){


                    while (!stack.isEmpty()&&stack.peek()<temperatures[i]){
                        result[index.peek()]=i-index.peek();
                        index.pop();
                        stack.pop();
                    }
                stack.push(temperatures[i]);
                index.push(i);
            
        }


        while (stack.isEmpty()){
            result[index.pop()]=0;
            stack.pop();
        }

        return result;



        
        
    }
}
