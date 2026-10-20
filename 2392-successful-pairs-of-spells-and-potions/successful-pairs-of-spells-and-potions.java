class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
int[]ans=new int[spells.length];
        for(int i=0;i<spells.length;i++){
int idx=fn(potions,spells[i],success);
ans[i]=potions.length-idx;

        }
        return ans;
    }
    public int fn(int[]potions,int item,long success){
        //int ans=0;
        int lo=0,hi=potions.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if((long)potions[mid] *item>=success){
               // ans=mid;
                hi=mid-1;
            }
            else
            lo=mid+1;
        }
        return lo;
    }
}