class Solution {
    public int findPermutationDifference(String s, String t) {
       int c=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int p=t.indexOf(ch);
        c+=Math.abs(i-p);
       } 
       return c;
    }
}