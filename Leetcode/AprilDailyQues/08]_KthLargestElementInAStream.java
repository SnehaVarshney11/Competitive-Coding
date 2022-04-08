package AprilDailyQues;

import java.util.PriorityQueue;

class KthLargestElementInStream{
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private int k;
    public void KthLargest(int k, int[] nums) {
        this.k = k;
		for (int i: nums) {
			minHeap.add(i);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}
    }
    
    public int add(int val) {
        minHeap.add(val);
		if (minHeap.size() > k) {
			minHeap.poll();
		}
		return minHeap.peek();
    }
}