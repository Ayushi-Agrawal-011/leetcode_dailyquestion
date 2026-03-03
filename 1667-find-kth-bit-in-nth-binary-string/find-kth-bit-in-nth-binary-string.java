class Solution {
    public char findKthBit(int n, int k) {
     StringBuilder ans=new StringBuilder("0");
     for(int i=2;i<=n;i++){
        StringBuilder inverted=new StringBuilder();
        for(int j=0;j<ans.length();j++){
         inverted.append(ans.charAt(j) == '0' ? '1' : '0');
        }
        inverted.reverse();
        ans.append("1").append(inverted);
     }   
       return ans.charAt(k - 1);
    }
}