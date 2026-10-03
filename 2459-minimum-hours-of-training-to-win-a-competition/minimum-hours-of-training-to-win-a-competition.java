class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int ce=initialEnergy;
        int cexp=initialExperience;
        int ans=0;
        for(int i=0;i<energy.length;i++){
            if(ce<=energy[i]){
  int x = energy[i] - ce + 1;
                ans += x;
                ce += x;  
            }
            if(cexp<=experience[i]){
                    int x = experience[i] - cexp + 1;
                ans += x;
                cexp += x;    
            }
            ce-=energy[i];
            cexp+=experience[i];
        }
        return ans;
    }
}