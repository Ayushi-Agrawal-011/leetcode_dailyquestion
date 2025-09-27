class Solution {
    public int findPeakElement(int[] arr) {
 int start=1;
 int n=arr.length;
	       int last=n-2;
           	if(arr.length == 1) return 0; 
	    if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;
       

	      while(start<=last) {
	    	int   mid=(start+last)/2;
	    	   if(arr[mid]> arr[mid-1] && arr[mid]>arr[mid+1]) {
	    		   return mid;
	    	   }
	    	   else if(arr[mid-1]>arr[mid]) {
	    		last=mid-1;
	    	   }
	    	   else if(arr[mid+1]>arr[mid]) {
	    		  start=mid+1;
	    		 
	    	   }
	    	  
	       }
	       return -1;
        
    }
}