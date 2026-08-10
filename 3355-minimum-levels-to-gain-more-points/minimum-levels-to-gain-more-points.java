class Solution {
    public int minimumLevels(int[] possible) {
        int sum=0;
        int[]pref=new int[possible.length];
        
        for(int i=0;i<possible.length;i++){
            if(possible[i]==0)
            possible[i]=-1;
            sum+=possible[i];

        }
        pref[0]=possible[0];
        for(int i=1;i<possible.length;i++){
            pref[i]=pref[i-1]+possible[i];
        }
        for(int i=0;i<possible.length-1;i++){
            if(pref[i]>sum-pref[i])
            return i+1;
        }
        return -1;
    }
}