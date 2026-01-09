class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
    int ei=intervals[0][1];
    int c=1;
    for(int i=1;i<intervals.length;i++){
        if(intervals[i][0]>=ei){
            ei=intervals[i][1];
            c++;
        }
    }
    return intervals.length-c;
    }
}