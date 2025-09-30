class Solution {
    public int characterReplacement(String s, int k) {
         int maxLen = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            maxLen = Math.max(maxLen, Maxlen(s, ch, k));
        }
        return maxLen;
    
}

    public static int Maxlen(String s,char ch,int k) {
	int si=0,ei=0,flip=0,ans=0;
	while(ei<s.length())
	{if(s.charAt(ei)!=ch)
		flip++;
	while(flip>k && si<=ei) {
		if(s.charAt(si)!=ch) {
			flip--;
		}
		si++;
	}
	ans=Math.max(ans, ei-si+1);
	//System.out.println(ans);
	ei++;
	}
	return ans;
}
}
