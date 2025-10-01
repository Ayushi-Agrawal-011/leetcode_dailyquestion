class Solution {
    public String largestNumber(int[] nums) {
        String []arr=new String [nums.length];
    for(int j=0;j<nums.length;j++){
       arr[j]=String.valueOf(nums[j]);
    }
    int n=nums.length;
    for(int j=0;j<n-1;j++){
        for(int k=j+1;k<n;k++){
            String p=arr[j]+arr[k];
            String q=arr[k]+arr[j];
             if(q.compareTo(p)>0){
                 String temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
             }
        }
    }
    String j="";
    for(int w=0;w<arr.length;w++){
      j+=arr[w];
    //    System.out.print(arr[w]);
    }
    if (j.startsWith("0")) {
                return "0";
            } 
    return j;
    }
}