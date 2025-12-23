class Solution {
    public int maxTwoEvents(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
	PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
	
    int c=0,d=0;
    for (int i = 0; i < intervals.length; i++) {
		while (!pq.isEmpty() &&intervals[i][0] > pq.peek()[0] ) {
			
d=Math.max(d,pq.poll()[1]);
		}
  
		c=Math.max(c,intervals[i][2]+d);
        pq.add(new int[]{intervals[i][1],intervals[i][2]});
		 
	}
    return c;
    }
}