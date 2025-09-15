class Solution {
    public int canBeTypedWords(String s, String s1) {
        String [] arr=s.split("\\s+");
        int c=0;
        for(int i=0;i<arr.length;i++){
            int d=0;
         for(int j=0;j<s1.length();j++){
            if(arr[i].indexOf(s1.charAt(j))!=-1){
                d=1;
                break;
            }
         }
         if(d==0)
         c++;
        }
        return c;
    }
}