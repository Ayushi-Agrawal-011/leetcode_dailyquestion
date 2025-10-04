class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ll=new ArrayList<>();
        Print(s,"",ll);
        return ll;
    }
    public static void Print(String ques,String ans,List<String> ll) {
	if(ques.length()==0){
        ll.add(ans);
        return;
    }
    char ch=ques.charAt(0);
    if(ch>=48 && ch<=57){
        Print(ques.substring(1),ans+ch,ll);
    }
    else if(ch>=65 && ch<=90){
         Print(ques.substring(1),ans+ch,ll);
          Print(ques.substring(1),ans+(char)(ch+32),ll);
    }
    else{
         Print(ques.substring(1),ans+ch,ll);
          Print(ques.substring(1),ans+(char)(ch-32),ll);
    }
        }
	

}