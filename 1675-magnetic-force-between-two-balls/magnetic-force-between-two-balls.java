class Solution {
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int lo=1;
        int high=position[n-1]-position[0];
        int ans=0;
        while(lo<=high){
            int mid=lo+(high-lo)/2;
            if(isitpossible(position,m,mid)){
                ans=mid;
                lo=mid+1;

            }
            else
            high=mid-1;
        }
        return ans;
    }
    public boolean isitpossible(int[]position,int m,int mid){
        int c=1;
        int pos=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-pos>=mid){
                c++;
                pos=position[i];
            }
            if(c==m)
            return true;
        }
        return false;
    }
}