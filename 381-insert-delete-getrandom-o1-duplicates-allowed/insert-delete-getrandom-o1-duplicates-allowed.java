class RandomizedCollection {
List<Integer> ans;
    public RandomizedCollection() {
        ans=new ArrayList<>();
    }
    
    public boolean insert(int val) {
       boolean f=true;
       if(ans.contains(val))
       f=false;
        ans.add(val);
          //System.out.println(ans);
          if(f==true)
          return true;
        return false;
    }
    
    public boolean remove(int val) {
        if(!ans.contains(val) || ans.size() == 0)
            return false;

        ans.remove(Integer.valueOf(val));

        return true;
    }
    
    public int getRandom() {
    return ans.get((int)(Math.random() * ans.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */