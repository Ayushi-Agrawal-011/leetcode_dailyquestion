class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        if(arr.length<=2)
        return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
    int a=arr[j];
    int b=arr[i];
    int c=2;
    while(map.containsKey(a+b)){
        c++;
        ans=Math.max(ans,c);
        int temp=a;
        a=a+b;
        b=temp;

    }
}
        }
        return ans;
    }
}