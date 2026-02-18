class Solution {
    public int maximumInvitations(int[] favorite) {
       int n=favorite.length;
        int[]in =new int[n];
        for(int x:favorite){
            in[x]++;
        }
        Queue<Integer> q=new LinkedList<>();
       
         for(int i=0;i<n;i++){
            if(in[i]==0)
            q.add(i);
         }
          int[]chainlen=new int[n];
         boolean[]visited=new boolean[n];
         while(!q.isEmpty()){
            int r=q.poll();
            visited[r]=true;
            int v=favorite[r];
            chainlen[v]=Math.max(chainlen[v],chainlen[r]+1);
            in[v]--;
            if(in[v]==0)
            q.add(v);
         }
         int pair=0,max=0;
         for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int cyclelen=0;
            int curr=i;
            while(!visited[curr]){
                visited[curr]=true;
                curr=favorite[curr];
                cyclelen++;
            }
            if(cyclelen==2)
            pair+=2+chainlen[i]+chainlen[favorite[i]];
            else
            max=Math.max(max,cyclelen);
         }
         return Math.max(max,pair); 
    }
}