class Solution {
    public int removePalindromeSub(String s) {
        if(ispalindrome(s))
        return 1;
        return 2;
    }
 
    	public static boolean ispalindrome(String s){
		int i=0,j=s.length()-1;
		while(i<j) {
		  if(s.charAt(i)!=s.charAt(j))
			return false;
		i++;
		j--;
		}
		return true;
	}
}