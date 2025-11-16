class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int diff=arr[i]-difference;
            if(map.containsKey(diff))
            map.put(arr[i],map.get(diff)+1);
            else
            map.put(arr[i],1);
            ans=Math.max(ans,map.get(arr[i]));
        }
        return ans;
    }}