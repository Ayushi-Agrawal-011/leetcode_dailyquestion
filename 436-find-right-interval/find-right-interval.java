class Solution {
    public int[] findRightInterval(int[][] intervals) {
        
        int n=intervals.length;
        int[][] ans=new int[n][2];

        int k=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int []i:intervals){
            ans[k]=i.clone();
            map.put(i[0],k);
            k++;
        }
        Arrays.sort(ans,(a,b)->(a[0]-b[0]));
       int[]res=new int[n];
       Arrays.fill(res,-1);
       for(int i=0;i<n;i++){

       int end=intervals[i][1];
       for(int j=0;j<n;j++){
        if(ans[j][0]>=end){
            res[i]=map.get(ans[j][0]);
            break;
        }
       }
       }
       return res;

    }
}