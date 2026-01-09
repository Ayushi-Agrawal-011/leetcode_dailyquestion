class Solution {
Queue<Integer> q=new LinkedList<>();
    public Solution(int[] w) {
        int s=0;
        for(int x:w)
        s+=x;
        for(int i=0;i<w.length;i++){
            for(int j=0;j<((w[i]*100)/s);j++)
            q.add(i);
        }
    }
    
    public int pickIndex() {
         if(q.isEmpty()) return 0;
    int p=q.poll();
    q.add(p);
    return p;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */