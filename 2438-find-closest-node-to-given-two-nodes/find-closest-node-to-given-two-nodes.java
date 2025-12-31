class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
       int[]d1=fn(edges,node1);
       int[]d2=fn(edges,node2);
       int node=-1;
       int ans=Integer.MAX_VALUE;
       for(int i=0;i<edges.length;i++){
        if(d1[i]==-1 || d2[i]==-1)
        continue;
        int a=Math.max(d1[i],d2[i]);
        if(a<ans){
            ans=a;
            node=i;
        }
       }
      
       return node;
    }
    public int[] fn(int[]edges,int node){
        int[]ans=new int[edges.length];
        Arrays.fill(ans,-1);
        int cur=node;
        int d=0;
        while(cur!=-1 && ans[cur]==-1){
            ans[cur]=d;
cur=edges[cur];
d++;
        }
        return ans;
    }
}