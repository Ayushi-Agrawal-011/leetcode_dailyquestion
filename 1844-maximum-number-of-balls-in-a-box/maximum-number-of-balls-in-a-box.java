class Solution {
    public int countBalls(int lowLimit, int highLimit) {
       int n=lowLimit-highLimit+1;
       HashMap<Integer,Integer> map=new HashMap<>();
       int ans=0;
        for(int i=lowLimit;i<=highLimit;i++){
            int x=sum(i);
            map.put(x,map.getOrDefault(x,0)+1);
            ans=Math.max(ans,map.get(x));

        }
        return ans;
    }
    public int sum(int x){
        int s=0;
        while(x>0){
            s+=x%10;
            x=x/10;
        }
        return s;
    }
}