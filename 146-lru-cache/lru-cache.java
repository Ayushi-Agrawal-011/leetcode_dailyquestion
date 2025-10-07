class LRUCache {
HashMap<Integer,Integer> map;
    private Queue<Integer> queue;
    private int capacity;
    public LRUCache(int capacity) {
    
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.queue = new LinkedList<>();
    }
    
    public int get(int key) {
             if (!map.containsKey(key)) return -1;
        // Move key to most recent
        queue.remove(key);
        queue.add(key);
        return map.get(key);
    }
    
    public void put(int key, int value) {
      if (map.containsKey(key)) {
            queue.remove(key);
        } else if (map.size() == capacity) {
            // remove least recently used
            int oldest = queue.poll();
            map.remove(oldest);
        }
        map.put(key, value);
        queue.add(key);    
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */