class Solution {
    public int primeSubarray(int[] nums, int k) {
    int n=nums.length;
    boolean[]isprime=new boolean[n];
    for(int i=0;i<n;i++){
        isprime[i]=fn(nums[i]);
    }
    int lastp=-1;
    int secondlastp=-1;
    TreeMap<Integer,Integer> map=new TreeMap<>();
    int si=0,ei=0;
    int ans=0,c=0;
    while(ei<n){
        if(isprime[ei]){
         c++;
         secondlastp=lastp;
         lastp=ei;
         map.put(nums[ei],map.getOrDefault(nums[ei],0)+1);

        }
        while(!map.isEmpty() && map.lastKey()-map.firstKey()>k){
            if(isprime[si]){
            c--;
            map.put(nums[si],map.getOrDefault(nums[si],0)-1);
            if(map.get(nums[si])==0)
            map.remove(nums[si]);
            }
            si++;
        }
        if(c>=2)
        ans+=(secondlastp-si+1);

        ei++;
    }
    return ans;
    }

public boolean fn(int n){
    if(n<=1)
    return false;
    if(n==2)
    return true;
    if(n%2==0)
    return false;
    for(int i=3;i*i<=n;i+=2){
        if(n%i==0)
        return false;
    }
    return true;
}}

