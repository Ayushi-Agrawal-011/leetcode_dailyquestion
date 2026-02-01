class Solution {
   public static void rotate(int []arr,int k) {
		int n=arr.length;
		k=k%n;
		reverse_range(arr,0,n-k-1);
		reverse_range(arr,n-k,n-1);
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
