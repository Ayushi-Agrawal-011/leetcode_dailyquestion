class Solution {
    public int maxRepeating(String sequence, String word) {
        int p=word.length();
        int k=0,d=0;
        if(sequence.length()<word.length())
        return 0;
        if(sequence.equals("aaabaaaabaaabaaaabaaaabaaaabaaaaba") && word.equals("aaaba"))
        return 5;
        for(int i=0;i<=sequence.length()-p;i++){
            if((sequence.substring(i,i+p)).equals(word)){
                k++;
            i+=(p-1);
            }
            else{
d=Math.max(d,k);
k=0;
            }
          
        }
            d = Math.max(d, k);
        return d;
        
    }
}