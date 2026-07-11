class StockSpanner {

    Stack<Integer> stack;
    Stack<Integer> freq;
    public StockSpanner() {
        stack = new Stack<>();   
        freq= new Stack<>();   
    }
    
    public int next(int price) {
            int count=1;
            while (!freq.isEmpty() && stack.peek()<=price){
                count+=freq.pop();
                stack.pop();
             }
            stack.add(price);
            freq.add(count);
            return count;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */