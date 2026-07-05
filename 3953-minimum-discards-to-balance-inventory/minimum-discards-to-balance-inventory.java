class Solution {
    public int minArrivalsToDiscard(int[] arr, int w, int m) {
        int ei=0,si=0,ans=0;
        boolean[] discard=new boolean[arr.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        while(ei<arr.length){
            while(si<=ei-w){
if(!discard[si]){
     map.put(arr[si],map.getOrDefault(arr[si],0)-1);    
            if(map.get(arr[si])==0)
            map.remove(arr[si]);
            
}
si++;
            }
            if(map.getOrDefault(arr[ei], 0)>=m){
                discard[ei]=true;
                ans++;
            }
            else
            map.put(arr[ei],map.getOrDefault(arr[ei],0)+1);
           
            ei++;
        }
        return ans;
    }
}