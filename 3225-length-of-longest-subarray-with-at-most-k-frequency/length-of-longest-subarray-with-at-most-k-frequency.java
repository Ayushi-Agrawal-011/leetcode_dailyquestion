class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ei=0,si=0,ans=0;
       
                     while(ei<arr.length){
                          map.put(arr[ei],map.getOrDefault(arr[ei],0)+1);
                        while(map.get(arr[ei])>k){
                              map.put(arr[si],map.getOrDefault(arr[si],0)-1);
                              if(map.get(arr[si])==0)
                         map.remove(arr[si]);
                         si++;
                          }
                           
                        ans=Math.max(ans,ei-si+1);
                     
                     ei++;

                     }
                     return ans;
                    


    }
}