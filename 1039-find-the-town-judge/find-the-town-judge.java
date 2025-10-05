class Solution {
    public int findJudge(int n, int[][] nums) {
    int [] a=new int[n];
    int []b=new int[n];
    for(int i=0;i<nums.length;i++){
        int c=nums[i][0];
        int d=nums[i][1];
        a[c-1]++;
        b[d-1]++;
    }
    for(int i=0;i<n;i++){
        if(a[i]==0 && b[i]==n-1)
        return i+1;
    }
    return -1;
    }
}