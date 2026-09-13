class Solution {
    public int nonSpecialCount(int l, int r) {
         int lim = (int) Math.sqrt(r);
        boolean[]ans=new boolean[lim+1];
        ans[0]=false;
        ans[1]=false;
        for(int i=2;i<=lim;i++){
            ans[i]=true;
        }
        for(int i=2;i*i<=lim;i++){
            for(int j=i*i;j<=lim;j+=i){
                ans[j]=false;
            }
        }
        int c=0;
        
        for(int i=2;i<=lim;i++){
            if(ans[i]){
                int square=i*i;
                if(square>=l && square<=r)
                c++;
            }
        }
return (r-l+1)-c;
    }
}