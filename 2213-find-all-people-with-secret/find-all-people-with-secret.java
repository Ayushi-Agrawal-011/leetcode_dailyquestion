class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] m : meetings) {
            int u = m[0], v = m[1], t = m[2];
            graph[u].add(new int[]{v, t});
            graph[v].add(new int[]{u, t});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // {time, person}
        
        int[] timeArr = new int[n];
        Arrays.fill(timeArr, Integer.MAX_VALUE);

        pq.add(new int[]{0, 0});
        pq.add(new int[]{0, firstPerson});

        timeArr[0] = 0;
        timeArr[firstPerson] = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int time = curr[0];
            int person = curr[1];

            if (time > timeArr[person]) continue;

            for (int[] nbr : graph[person]) {
                int nextPerson = nbr[0];
                int meetingTime = nbr[1];

                if (meetingTime >= time && meetingTime < timeArr[nextPerson]) {
                    timeArr[nextPerson] = meetingTime;
                    pq.add(new int[]{meetingTime, nextPerson});
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (timeArr[i] != Integer.MAX_VALUE) {
                ans.add(i);
            }
        }

        Collections.sort(ans);
        return ans;
    }
}