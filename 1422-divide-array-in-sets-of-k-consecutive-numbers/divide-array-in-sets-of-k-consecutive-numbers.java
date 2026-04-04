class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
    int n=nums.length;
    if(n%k!=0)
    return false;
    TreeMap<Integer,Integer> map=new TreeMap<>();
    for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
    }
    while(!map.isEmpty()){
        int f=k;
        int key=map.firstKey();
        while(f>0){
            if(!map.containsKey(key))
            return false;
                map.put(key,map.getOrDefault(key,0)-1);
                if(map.get(key)==0)
                map.remove(key);
                f--;
                key++;
        }
    }
    return true;
    }
}