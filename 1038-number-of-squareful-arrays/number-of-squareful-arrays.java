class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        boolean[]visited=new boolean[nums.length];
        fn(nums,visited,0,new ArrayList<>());
        return res.size();

    }
    public  void fn(int[]nums,boolean[]visited,int i,List<Integer>ll){
        if(i>=nums.length){
            res.add(new ArrayList<>(ll));
            return;
        }
        for(int j=0;j<nums.length;j++){
             if (visited[j]) continue;
            if(j>0 && nums[j]==nums[j-1] && !visited[j-1])
            continue;
               if (!ll.isEmpty() && !isSquare(ll.get(ll.size() - 1) + nums[j])) continue;
       
            visited[j]=true;
            ll.add(nums[j]);
            fn(nums,visited,i+1,ll);
            ll.remove(ll.size()-1);
            visited[j]=false;
        }

    }
    public boolean isSquare(int a){

        int sqrt=(int)Math.sqrt(a);
        return sqrt*sqrt==a;
    }
}