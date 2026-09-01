class Solution {
    public List<String> validStrings(int n) {
        List<String> ll=new ArrayList<>();
        CoinToss(n,"",ll);
        return ll;
    }
    public static void CoinToss(int n,String ans,List<String> ll) {
		if(n==0) {
			ll.add(ans);
			return;
		}
		if( ans.length()==0 || ans.charAt(ans.length()-1)!='0')
		        CoinToss(n-1,ans+"0",ll);
		CoinToss(n-1,ans+"1",ll);
		
	}
}