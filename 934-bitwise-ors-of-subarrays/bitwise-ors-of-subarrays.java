class Solution {
    public int subarrayBitwiseORs(int[] arr) {
       Set<Integer> set=new HashSet<>();
       for(int i=0;i<arr.length;i++){
        int or=arr[i];
        set.add(arr[i]);
        for(int j=i-1;j>=0;j--){

            if(arr[j]==(arr[j]|arr[i]))
            break;
           arr[j]|=arr[i];
           set.add(arr[j]);
        }
       } 
       return set.size();
    }
}