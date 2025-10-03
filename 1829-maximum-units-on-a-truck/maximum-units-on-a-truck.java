class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
       int k=0;
       int s=0;
       for(int i=0;i<boxTypes.length;i++){

      
        int p=boxTypes[i][0];
        if((truckSize-k)>=p){
              int q=boxTypes[i][1];
          s+=(p*q);
       
          k+=p;
        }
        else{
            s+=(truckSize-k)*boxTypes[i][1];
            break;
        }
       }  
       return s;
    }
}