class Solution {
    public void reverseString(char[] s) {
        ispal(s,0,s.length-1);
    }
    public static void ispal(char[] s,int i,int j){
         if(i>=j)
        return ;
     char a=s[i];
     s[i]=s[j];
     s[j]=a;
       
        ispal(s,i+1,j-1);
      
    }
}
