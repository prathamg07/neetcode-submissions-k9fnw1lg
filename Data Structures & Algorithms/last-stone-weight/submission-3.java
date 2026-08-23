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

            maxHeap.add(x-y);
        }

        return maxHeap.poll();
        
    }
}
