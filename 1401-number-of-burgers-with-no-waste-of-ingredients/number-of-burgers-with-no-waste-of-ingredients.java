class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
      List<Integer> ans = new ArrayList<>();
        int val1 = tomatoSlices - 2 * cheeseSlices;
        int val2 = 4 * cheeseSlices - tomatoSlices;
        
        if (val1 < 0 || val1 % 2 != 0 || val2 < 0 || val2 % 2 != 0) {
            return ans;
        }
        
        int jumbo = val1 / 2;
        int small = val2 / 2;
        ans.add(jumbo);
        ans.add(small);
        return ans;   
    
    }
}