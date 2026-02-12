class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[]ans=new int[k];
        HashMap<Integer,Set<Integer>> map=new HashMap<>();
        for(int i=0;i<logs.length;i++){
            int a=logs[i][0];
            int b=logs[i][1];
            if(!map.containsKey(a))
            map.put(a,new HashSet<>());
            map.get(a).add(b);
        }
        for(int key:map.keySet()){
            if(map.get(key).size()<=k)
            ans[map.get(key).size()-1]++;
        }
        return ans;
    }
}