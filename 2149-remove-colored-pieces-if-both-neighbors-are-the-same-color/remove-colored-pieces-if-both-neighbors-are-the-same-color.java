class Solution {
    public boolean winnerOfGame(String s) {
     int c=0,d=0;
       for(int i=1;i<s.length()-1;i++){
        char ch=s.charAt(i);
        if(ch==s.charAt(i-1)   && ch== s.charAt(i+1)){
            if(ch=='A')
            c++;
            else
            d++;
        }
       } 
       return c>d;
    }
}