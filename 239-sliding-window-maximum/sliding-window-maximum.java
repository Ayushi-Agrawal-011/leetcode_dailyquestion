class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
         int n = arr.length;
        int[] result = new int[n - k + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int i=0;i<k;i++) {
	  pq.offer(new int[]{arr[i], i});
	}
      result[0] = pq.peek()[0];
    for (int i = k; i < n; i++) {
            pq.offer(new int[]{arr[i], i});
            
            // remove elements outside the window
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            
            // max of current window
            result[i - k + 1] = pq.peek()[0];
        }
        return result;
    }
}
