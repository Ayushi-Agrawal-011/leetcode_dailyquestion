class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
      int i=0;
      int ans=0;
      while(i<fruits.length){
     int j=0;
    while(j<baskets.length){
        if(fruits[i]<=baskets[j]){
            baskets[j]=-1;
            break;
        }
        j++;
    }
    if(j==baskets.length){
ans++;
    }
    i++;
      }
      return ans;  
    }
}