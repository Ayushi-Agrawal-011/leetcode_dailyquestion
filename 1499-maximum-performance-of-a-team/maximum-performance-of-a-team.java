class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
   int[][]arr=new int[n][2];
   for(int i=0;i<n;i++){
    arr[i][0]=speed[i];
    arr[i][1]=efficiency[i];
   }     
   Arrays.sort(arr,(a,b)->(a[1]!=b[1])?b[1]-a[1]:b[0]-a[0]);
   PriorityQueue<Integer> pq=new PriorityQueue<>();
   long res=0 ,ans=0;
   for(int i=0;i<n;i++){
    int s=arr[i][0];
    int e=arr[i][1];
    ans+=s;
    pq.add(s);
    if(pq.size()>k){
        ans-=pq.poll();
    }
    res=Math.max(res,ans*e);
   }
   return (int)(res % 1000000007);
    }
}