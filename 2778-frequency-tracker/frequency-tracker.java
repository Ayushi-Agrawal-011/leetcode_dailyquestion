class FrequencyTracker {
HashMap<Integer,Integer> map;
HashMap<Integer, Integer> count;
    public FrequencyTracker() {
        map=new HashMap<>();
      count = new HashMap<>();
    }
    
    public void add(int number) {
int old=map.getOrDefault(number,0);
if (old > 0) 
{ 
    count.put(old, count.get(old) - 1);
}
    int curr = old + 1; 
    map.put(number, curr); 
      count.put(curr, count.getOrDefault(curr, 0) + 1);
}
    
    
    
    public void deleteOne(int number) {
        if (!map.containsKey(number)) return;
      int old = map.getOrDefault(number,0);
      count.put(old, count.get(old) - 1);
      int curr = old - 1;
      if (curr == 0) { 
        map.remove(number);
         }
          else { 
            map.put(number, curr);
            count.put(curr, count.getOrDefault(curr, 0) + 1);
             }
    }
    
    public boolean hasFrequency(int frequency) {
        return count.getOrDefault(frequency, 0) > 0;
  
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */