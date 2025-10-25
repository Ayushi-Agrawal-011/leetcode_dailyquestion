class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int []ab=NGE(nums2);
      int []k=new int[nums1.length];
      int p=0;
      for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
          if(nums2[j]==nums1[i]){
            k[p]=ab[j];
            p++;
            break;
          }
        }
      }
      return k;
    }
      public static int [] NGE(int []arr) {
		int[]ans=new int [arr.length];
		Stack <Integer> st=new Stack<>();
		for(int i=0;i<ans.length;i++) {
			while(!st.isEmpty()&& arr[i]>arr[st.peek()]) {
				ans[st.pop()]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		
	  return ans;
    }
}