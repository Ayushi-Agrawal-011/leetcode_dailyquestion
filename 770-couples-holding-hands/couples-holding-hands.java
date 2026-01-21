class Solution {
    public int minSwapsCouples(int[] row) {
        int swaps=0;
        for(int i=0;i<row.length;i=i+2){
            int xor=row[i]^1;
            if(row[i+1]==xor)
            continue;
            swaps++;
            for(int j=i+1;j<row.length;j++){
                if(row[j]==xor){
                    int temp=row[j];
                    row[j]=row[i+1];
                    row[i+1]=temp;
                    break;
                }
            }
        }
        return swaps;
    }
}