class Solution {
    public int partitionDisjoint(int[] arr) {   
      int []left=new int[arr.length];
	        int []right=new int[arr.length];
	        int n=arr.length;
	        left[0]=arr[0];
	        right[n-1]=arr[n-1];
	        for(int i=1;i<n;i++){
	  left[i]=Math.max(left[i-1],arr[i]);
	        }
	        for(int i=n-2;i>=0;i--){
	            right[i]=Math.min(right[i+1],arr[i]);
	        }
	        int ans=0;
	        for(int i=1;i<n;i++){
	           if(left[i-1]<=right[i]){
                return i;
               }
	        }
	        return ans;
    }
}