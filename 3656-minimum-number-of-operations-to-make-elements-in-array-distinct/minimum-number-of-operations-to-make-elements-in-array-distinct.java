class Solution {
    public int minimumOperations(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
       }
       if(isdistinct(map))
       return 0;
       int ans=0;
       List<Integer> ll=new ArrayList<>();
for(int x:nums){
    ll.add(x);
}
while(!ll.isEmpty()){
    if(ll.size()<3)
    return ans+1;
    for(int i=0;i<3;i++){
        int x=ll.get(i);
        map.put(x,map.getOrDefault(x,0)-1);
        if(map.get(x)==0)
        map.remove(x);
    }
    ll=ll.subList(3,ll.size());
    ans++;
    if(isdistinct(map))
    return ans;
}
        return ans; 

    }
    boolean isdistinct(Map<Integer, Integer> map) {
    for (int freq : map.values()) {
        if (freq > 1) {
            return false;
        }
    }
    return true;
}
}