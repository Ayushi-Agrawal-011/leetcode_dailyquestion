class Solution {
    public boolean doesAliceWin(String s) {
        // if odd vowels h tohh alice puri remove kr skta 
        // even vowels h -alice ek remove krega toh bob k paas move nhi bchega isliye alice jeetega
        for(char ch:s.toCharArray()){
         if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                return true;
        }
        return false;
    }
}