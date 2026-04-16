class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n=nums.length;
      HashMap<Integer,List<Integer>> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int x=nums[i];
        if(!map.containsKey(x)){
            map.put(x,new ArrayList<>());

        }
        
            map.get(x).add(i);
        
      
      }  
      List<Integer> ans=new ArrayList<>();
      for(int i=0;i<queries.length;i++){
       int q=queries[i];
       List<Integer> ll=map.get(nums[q]);
        if (ll.size() == 1) {  
                ans.add(-1);
                continue;
            }
        int idx=bs(ll,q);
       if(idx==-1){
        ans.add(-1);
        continue;
       }
      
       int left=Integer.MAX_VALUE;
       int right=Integer.MAX_VALUE;
    
    //      left=ll.get(idx-1+ll.size() % ll.size());
    // int dist = Math.abs(q - left);
    // left = Math.min(dist, n - dist);   // 🔥 circular

    // right=ll.get((idx+1)%ll.size());
    // int dist = Math.abs(q - right);
    // right = Math.min(dist, n - dist);  // 🔥 circular

    //    ans.add(Math.min(left,right));
        // ✅ FIX: correct circular index
            int leftIdx = (idx - 1 + ll.size()) % ll.size();
            int rightIdx = (idx + 1) % ll.size();

            int leftVal = ll.get(leftIdx);
            int rightVal = ll.get(rightIdx);

            // ✅ FIX: correct circular distance
            int distL = Math.abs(q - leftVal);
            int distR = Math.abs(q - rightVal);

            left = Math.min(distL, n - distL);
            right = Math.min(distR, n - distR);

            ans.add(Math.min(left, right));
      }
      return ans;
    }

    public int bs(List<Integer> ll,int item){
int si=0;
int ei=ll.size()-1;
while(si<=ei){
    int mid=si+(ei-si)/2;
    if(ll.get(mid)==item){
        return mid;}
       else if(ll.get(mid)<item){
            si=mid+1;
       }
        else
        ei=mid-1;
    
   
}
 return -1;
    }
}