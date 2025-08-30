class Solution {
    public int maxRepOpt1(String s) {
//         int k=s.length();
//       int flip_a=Maxlen(s,'a',k);
// int flip_b=Maxlen(s,'b',k);
// System.out.print(flip_a);
// return   Math.max(flip_a,flip_b);
 int n = s.length();
        int[] freq = new int[26];
        
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int ans = 0;

        // Check for each character separately
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (freq[ch - 'a'] == 0) continue;
            ans = Math.max(ans, Maxlen(s, ch, freq[ch - 'a']));
        }

        return ans;
    }
    public static int Maxlen(String s,char ch,int k) {
	int si=0,ei=0,flip=0,ans=0;
	while(ei<s.length())
	{if(s.charAt(ei)!=ch)
		flip++;
	while(flip>1 && si<=ei) {
		if(s.charAt(si)!=ch) {
			flip--;
		}
		si++;
	}
	ans=Math.max(ans, ei-si+1);

	ei++;
	}
	return Math.min(ans,k);
}
}