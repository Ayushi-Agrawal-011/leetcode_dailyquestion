class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String s) {
        List<String> ans=new ArrayList<>();
        fn(s,ans,"");
        return ans;
    }
    public static void fn(String s,  List<String> ll,String ans){
        if(s.length()==0){
            ll.add(ans);
            return;
        }
        char ch=s.charAt(0);
        String gets=key[ch-'0'];
        for(int i=0;i<gets.length();i++){
            fn(s.substring(1),ll,ans+gets.charAt(i));
        }
    }
}