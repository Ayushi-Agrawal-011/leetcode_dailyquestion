class Solution {
    public int[] circularGameLosers(int n, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int curr=1;
        int i=1;
        map.put(curr,1);
        while(map.get(curr)!=2){
          
             int steps = ((curr - 1 + i * k) % n) + 1;

            map.put(steps,map.getOrDefault(steps,0)+1);
            curr=steps;
            i++;
        }
        if(n-map.size()<=0)
        return new int[]{};
        int[]ans=new int[n-map.size()];
        int j=0;
        for(int kp=1;kp<=n;kp++){
            if(!map.containsKey(kp)){
                ans[j]=kp;
                j++;
            }
        }
        return ans;
    }
}