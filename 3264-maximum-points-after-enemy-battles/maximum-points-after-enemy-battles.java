class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        Arrays.sort( enemyEnergies);
        long sum=currentEnergy;

         for(int x:enemyEnergies){
sum+=x;
         }
         long min=enemyEnergies[0];
          if (currentEnergy < min) return 0;
          sum-=min;
         return sum/min;
    }
}