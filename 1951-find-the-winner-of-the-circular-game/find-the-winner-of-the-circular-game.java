class Solution {
    public int findTheWinner(int n, int k) {
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<n;i++){
        q.add(i+1);
       }
       int c=0;
       while(q.size()>1){
        int r=q.poll();
        c++;
        if(c==k){
            c=0;
        }
        else
        q.add(r);
       }
       return q.poll();
    }
}