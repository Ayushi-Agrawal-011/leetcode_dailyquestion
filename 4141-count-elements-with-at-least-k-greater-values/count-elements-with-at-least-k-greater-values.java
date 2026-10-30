class Solution {
    public int countElements(int[] nums, int k) {
        if(k == 0) return nums.length;
if(k >= nums.length) return 0;
       TreeSet<Integer> set = new TreeSet<>();
HashMap<Integer, Integer> map = new HashMap<>();
	PriorityQueue<Integer> pq=new  PriorityQueue<>();
	for(int i=0;i<k;i++) {
		pq.add(nums[i]);
	}
	
	for(int i=k;i<nums.length;i++) {
		if(nums[i]>pq.peek()) {
			pq.poll();// samleest remove
			pq.add(nums[i]);//big added
			
		}
		
	}
set.addAll(pq);
for(int i=0;i<nums.length;i++){
    if(!set.contains(nums[i])){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
}
int ans=0;
for(int x:map.values()){
    ans+=x;
}
return ans;
    }
}