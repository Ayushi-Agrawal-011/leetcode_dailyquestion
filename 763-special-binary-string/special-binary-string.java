class Solution {
    public String makeLargestSpecial(String s) {
        int count=0;
        int i=0;
        List<String> res=new ArrayList<>();
       for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        if(ch=='1')
        count++;
        else if(ch=='0')
        count--;
        if(count==0){
            res.add("1"+makeLargestSpecial(s.substring(i+1,j))+"0");
            i=j+1;
        }
       }
       Collections.sort(res,Collections.reverseOrder());
       return String.join("",res);
    }
}