class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min heap: [frequency, number]
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        for (int key : map.keySet()) {

            heap.add(new int[]{map.get(key), key});

            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll()[1];
        }

        return ans;
    }
}