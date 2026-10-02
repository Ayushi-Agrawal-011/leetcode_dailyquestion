class Solution {
    public long maxSum(int[] nums, int k, int mul) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

for (int x : nums) {
    pq.add(x);
}
long ans=0;
while(k-->0){
    int r=pq.poll();
    if(mul>0){
   ans += (long) r * mul; 
    }
    else
    ans+=r;
    mul--;
}  
return ans;
    }
}