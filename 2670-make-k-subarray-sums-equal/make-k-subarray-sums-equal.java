class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
        int n=arr.length;
        boolean[]visited=new boolean[n];
        long ans=0;
        for(int i=0;i<n;i++){
            if(visited[i])
            continue;
            List<Integer> ll=new ArrayList<>();
            ll.add(arr[i]);
            int p=(i+k)%n;

            while(p!=i){
                visited[p]=true;
                ll.add(arr[p]);
                p=(p+k)%n;
            }
            Collections.sort(ll);
            int med=ll.get(ll.size()/2);
            for(Integer s:ll){
                ans+=Math.abs(s-med);
            }
        }
        return ans;
    }
}