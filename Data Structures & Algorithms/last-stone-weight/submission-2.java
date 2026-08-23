class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        //heapify
        for (int i = 0 ; i < stones.length ; i++){
            maxHeap.add(stones[i]);
        }

        while (maxHeap.size()>1){

            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if (x == y){
                maxHeap.add(0);
                continue ;
            }
            else {
                maxHeap.add(Math.abs(x-y));
            }
        }

        return maxHeap.poll();
        
    }
}
