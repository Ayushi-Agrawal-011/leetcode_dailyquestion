class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n=edges.length;
        int[]d1=fn(edges,node1);
        int[]d2=fn(edges,node2);
        int ans=Integer.MAX_VALUE;
        int node=-1;
      for(int i=0;i<n;i++){
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
        int n=edges.length;
        int[]ans=new int[n];
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