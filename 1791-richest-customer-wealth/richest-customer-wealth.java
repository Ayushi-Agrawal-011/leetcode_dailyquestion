class Solution {
    public int maximumWealth(int[][] arr) {
        int p=0;
        for(int i=0;i<=arr.length-1;i++){
            int s=0;
            for(int j=0;j<=arr[0].length-1;j++){
                s+=arr[i][j];
            }
            p=Math.max(s,p);
        }
        return p;
    }
}