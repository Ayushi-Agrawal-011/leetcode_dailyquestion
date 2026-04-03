class Solution {
    public int[] minOperations(String boxes) {
        char[]arr=boxes.toCharArray();
        int[]ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(j==i || arr[j]=='0')
                continue;
                c+=Math.abs(i-j);
            }
            ans[i]=c;
        }
        return ans;
    }
}