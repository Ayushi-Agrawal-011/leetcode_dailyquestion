class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
      for(int i=0;i<arr.length;i++) {
				
                reverse_range(arr[i],0,arr[i].length-1);
                        for(int j=0;j<arr[0].length;j++){
                            if(arr[i][j]==1)
                                arr[i][j]=0;
                            else if(arr[i][j]==0)
                                arr[i][j]=1;
                        }
                }  
      return arr;
    }
    public static void rotate(int []arr,int k) {
		int n=arr.length;
	
		reverse_range(arr,0,n-1);
	
		
	}
	public static void  reverse_range(int []arr,int i,int j) {
		 int k=i;
		 int p=j;
		 while(k<p) {
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
			  i++;
			  j--;
			  k++;
			  p--;
		  }}
}