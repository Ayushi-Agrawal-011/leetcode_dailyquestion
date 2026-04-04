class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;

        for (int x : nums) {
            pq.add((double) x);
            sum += x;
        }

        double half = sum / 2;
        int c = 0;

        while (!pq.isEmpty() && sum > half) {
            double x = pq.poll();

            sum -= x;
            sum += x / 2;

            pq.add(x / 2);
            c++;
        }

        return c;
    }
}