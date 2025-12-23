class Solution {
    public String generateTag(String caption) {
        caption=caption.trim();
       
        if(caption.length()==0)
        return "#";
       String[]arr=caption.split("\s+");
       StringBuilder sb=new StringBuilder("#");
       for(int i=0;i<arr.length;i++){
 String word=arr[i];
 char first=word.charAt(0);
 if(first>=65 && first<=90){
 if(i==0)
 sb.append((char)((int)first+32));
 else
  sb.append(first);
 }
 else{
 if(i==0)
   sb.append(first); 

 else
   sb.append((char)((int)first-32));
 }
 sb.append(word.substring(1,word.length()).toLowerCase());
       } 
       String k=sb.toString();
       if(k.length()<101)
       return k;
       return k.substring(0,100);
    }
}