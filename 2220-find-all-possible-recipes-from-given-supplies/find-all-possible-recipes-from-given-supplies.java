class Solution {
    private HashMap<String, List<String>> map;
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
         map = new HashMap<>(); 
      List<String> ans=new ArrayList<>();
            for (int i = 0; i < recipes.length; i++) {
            map.put(recipes[i], ingredients.get(i));
        }
 Set<String> available = new HashSet<>(Arrays.asList(supplies));
  Queue<String> q = new LinkedList<>();
 for (String recipe : recipes) {
            boolean canMake = true;
            for (String ingredient : map.get(recipe)) {
                if (!available.contains(ingredient)) {
                    canMake = false;
                    break;
                }
            }
            if (canMake) {
                q.offer(recipe);
            }
        }
          Set<String> made = new HashSet<>();  // Jo ban chuki hain
        
        while (!q.isEmpty()) {
            String recipe = q.poll();
            
            if (made.contains(recipe)) continue;  // Pehle hi ban chuki
            
            ans.add(recipe);
            made.add(recipe);
            available.add(recipe); 

            for (String nextRecipe : recipes) {
                if (made.contains(nextRecipe)) continue;
                
                boolean canMake = true;
                for (String ingredient : map.get(nextRecipe)) {
                    if (!available.contains(ingredient)) {
                        canMake = false;
                        break;
                    }
                }
                if (canMake) {
                    q.offer(nextRecipe);
                }
            }
        }
        return ans;
    }
}