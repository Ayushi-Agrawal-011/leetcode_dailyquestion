class Solution {
    public int minimumEffort(int[][] arr) {
        Arrays.sort(arr,(a,b)->(b[1]-b[0])-(a[1]-a[0]));
        int loan=0;
        int start=arr[0][1];
        int bal=arr[0][1]-arr[0][0];
        int i=0;
        for(int []e:arr){
            if(i==0){
                 i++;
            continue;
           
            }
            int cost=e[0];
            int th=e[1];
            if(bal<th){
               loan+=(th-bal);
               bal=th; 
            }
            bal-=cost;
        }
        return start+loan;
    }
}