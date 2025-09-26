class Solution {
    public int search(int[] nums, int target) {
      
        return binary_search(nums,target);
    }
    	public static int binary_search(int [] arr,int item) {
         
		    int start=0;
	       int last=arr.length-1;
	    
	       for(int mid;start<=last;) {
	    	   mid=start+(last-start)/2;
               if(arr[mid]==item)
               return mid;
	    	   if(arr[start]<=arr[mid]){
                if(item>=arr[start] && item<arr[mid])
                last=mid-1;
                else
                start=mid+1;
               }
               else {
                  if(item>arr[mid] && item<=arr[last])
                    start=mid+1;
                else
                   last=mid-1;
               }
	    	  
	       }
	       return -1;
	}
}