class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {

      int n=flowers.length;
      int [] si=new int [n];
       int [] ei=new int [n];
        int [] ans=new int [people.length];
      for(int i=0;i<n;i++){
       si[i]=flowers[i][0];
       ei[i]=flowers[i][1]+1;
      }  
      
      
 Arrays.sort(si);
      Arrays.sort(ei);
      for(int i=0;i<people.length;i++){
      int a=bs(si,people[i]);
      int b=bs(ei,people[i]);
      ans[i]=a-b;
      }
      return ans;
    }
    public int bs(int [] arr,int target){
        int lo=0,hi=arr.length;
        int mid=0;
        while(lo<hi){
            mid=lo+(hi-lo)/2;
            if(target<arr[mid])
            hi=mid;
            else
            lo=mid+1;
        }
        return lo;
    }
}