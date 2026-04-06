class Solution {
    public String compressedString(String word) {
        char[]chars=word.toCharArray();
         int len=1;
        long ans=0;

         char[] res = new char[word.length() * 2];
        int idx=0;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1] && len<9)
            len++;
            else{
                char p = chars[i];

               
                    String s = Long.toString(len);
                    for (char c : s.toCharArray()) {
                        res[idx++] = c;
                    }
                

                res[idx++]=p;

                len = 1;
            }
        }
        
           char q = chars[chars.length - 1];

     
            String s = Long.toString(len);
            for (char c : s.toCharArray()) {
                res[idx++] = c;
            }
        
        res[idx++]=q;
       return new String(res, 0, idx);
    }
}