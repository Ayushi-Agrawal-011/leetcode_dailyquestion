class Solution {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int[]part=new int[n];
        boolean[] unhappy=new boolean[n];
        for(int []p:pairs){
            part[p[0]]=p[1];
            part[p[1]]=p[0];
        }
        for(int [] p:pairs){
          for(int i=0;i<p.length;i++){
            int x=p[i];
            int y=part[x];
            for(int pref:preferences[x]){
                if(pref==y)
                break;
                int u=pref;
                int v=part[u];
                for(int upref:preferences[u]){
                    if(upref==v)
                    break;
                    if(upref==x){
                        unhappy[x]=true;
                        break;
                    }
                }
                

            }
          }
        }
        int ans=0;
        for(boolean t:unhappy){
            if(t)
            ans++;
        }
        return ans;
    }
}