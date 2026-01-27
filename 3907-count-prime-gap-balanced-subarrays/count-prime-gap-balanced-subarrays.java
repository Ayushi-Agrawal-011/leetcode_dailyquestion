class Solution {
    public int primeSubarray(int[] nums, int k) {
        int n=nums.length;
boolean[] isprime=new boolean[nums.length];
for(int i=0;i<n;i++){
    isprime[i]=fn(nums[i]);
}
int ei=0,si=0;
int prime=-1,lastprime=-1;
TreeMap<Integer,Integer> map=new TreeMap<>();
int c=0;
long ans=0;
while(ei<n){
    if(isprime[ei]){
        c++;
map.put(nums[ei],map.getOrDefault(nums[ei],0)+1);
lastprime=prime;
prime=ei;
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
    if(c>=2){
            ans+=(lastprime - si + 1);
        }
     ei++;
}
return (int)ans;
    }
public boolean fn(int n){
     if (n <= 1) return false;
    if(n==1)
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
}
}
