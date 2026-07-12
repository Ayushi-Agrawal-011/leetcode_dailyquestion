class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int r=1;
      int[]ll=arr.clone();
      Arrays.sort(ll);
        for(int i=0;i<ll.length;i++){
if(!map.containsKey(ll[i])){
    map.put(ll[i],r);
    r++;
}
        }
        int[]ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}