class Solution {
    
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> map = new HashMap<>();

        for (int[] r : rectangles) {
            double t = (double) r[0] / r[1];
            map.put(t, map.getOrDefault(t, 0L) + 1L);
        }
long ans=0;
for(double k:map.keySet()){
    long count = map.get(k);
            ans += count * (count - 1) / 2;
}
return ans;

    }
}