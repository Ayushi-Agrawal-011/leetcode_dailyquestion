class Solution {
    public int removeAlmostEqualCharacters(String s) {
       char []arr= s.toCharArray();
       int i=1;
       int ans=0;
       while(i<arr.length){
        if(arr[i]==arr[i-1] || Math.abs(arr[i]-arr[i-1])==1){
            ans++;
            i+=2;
        }
        else
        i++;
       }
       return ans;
    }
}