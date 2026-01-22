class Solution {
    public int[] findArray(int[] pref) {
        int[]left=new int[pref.length];
        left[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            left[i]=pref[i]^pref[i-1];
        }
        return left;
    }
}