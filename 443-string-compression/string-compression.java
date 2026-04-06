class Solution {
    public int compress(char[] chars) {
        long len=1;
        long ans=0;
        int idx=0;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1])
            len++;
            else{
                chars[idx++] = chars[i];

                if (len > 1) {
                    String s = Long.toString(len);
                    for (char c : s.toCharArray()) {
                        chars[idx++] = c;
                    }
                }

                len = 1;
            }
        }
        
           chars[idx++] = chars[chars.length - 1];

        if (len > 1) {
            String s = Long.toString(len);
            for (char c : s.toCharArray()) {
                chars[idx++] = c;
            }
        }
        return idx;
    }
}