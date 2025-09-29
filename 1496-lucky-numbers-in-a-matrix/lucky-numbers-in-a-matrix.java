class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ll=new ArrayList<>();
        Set<Integer> mini=new HashSet<>();
        Set<Integer> maxi=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            int k=Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
               k=Math.min(k,matrix[i][j]);
            }
             mini.add(k);
        }
        for(int i=0;i<matrix[0].length;i++){
            int k=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
               k=Math.max(k,matrix[j][i]);
            }
             maxi.add(k);
        }
        for(int x:mini){
            if(maxi.contains(x))
            ll.add(x);
        }
        return ll;
    }
}