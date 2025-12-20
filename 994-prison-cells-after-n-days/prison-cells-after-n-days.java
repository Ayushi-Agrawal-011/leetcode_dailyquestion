class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {n = (n - 1) % 14 +1;
        while(n-->0){
           int[] temp=new int[8];
           for(int i=1;i<7;i++){
         
            if(cells[i-1]==cells[i+1]){       
           temp[i]=1;
            }
          
          
            
      
           } 
         
         cells=temp;
            
        }
        return cells;
    }
}