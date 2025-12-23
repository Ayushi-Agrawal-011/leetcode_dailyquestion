class Solution {
    public int countKeyChanges(String s) {
        int c=0;
       for(int i=0;i<s.length()-1;i++){
        char ch=s.charAt(i);
        char ch1=s.charAt(i+1);
        if(ch>=97 && ch<=122){
if(ch1==(char)((int)ch-32))
c+=0;
else if(ch==ch1)
c+=0;
else{
    System.out.println(ch+" "+ch1);
    c++;
}

        }
          if(ch>=65 && ch<=90){
if(ch1==(char)((int)ch+32))
c+=0;
else if(ch==ch1)
c+=0;
else{
    System.out.println(ch+" "+ch1);
    c++;
}
        }
       } 
       return c;
    }
}