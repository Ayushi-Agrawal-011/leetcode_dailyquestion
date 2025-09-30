class Solution {
    public int longestOnes(int[] nums, int k) {
    int flip_b=Maxlen(nums,0,k);
    return flip_b;
    }
   
public static int Maxlen(int []nums,int ch,int k) {
	int si=0,ei=0,flip=0,ans=0;
	while(ei<nums.length)
	{if(nums[ei]==ch)
		flip++;
	while(flip>k && si<=ei) {
		if(nums[si]==ch) {
			flip--;
		}
		si++;
	}
	ans=Math.max(ans, ei-si+1);
	System.out.println(ans);
	ei++;
	}
	return ans;
}

}