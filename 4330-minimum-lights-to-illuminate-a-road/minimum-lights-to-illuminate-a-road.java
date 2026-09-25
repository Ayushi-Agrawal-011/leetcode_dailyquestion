class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        int[] diff = new int[n + 1];
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (lights[i] > 0) {
                int mini = Math.max(0, i - lights[i]);
                int maxi = Math.min(n - 1, i + lights[i]);

                diff[mini]++;
                diff[maxi + 1]--;
            }
        }

        int cover = 0;

        for (int i = 0; i < n; i++) {
            cover += diff[i];

            if (cover == 0) {
                c++;

                int pos = Math.min(n - 1, i + 1);

                int mini = Math.max(0, pos - 1);
                int maxi = Math.min(n - 1, pos + 1);

                cover++;
                diff[maxi + 1]--;
            }
        }

        return c;
    }
}