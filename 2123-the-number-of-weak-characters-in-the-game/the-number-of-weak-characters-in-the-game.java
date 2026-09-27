class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
           Arrays.sort(arr, (a,b) -> {
            if(a[0] == b[0])
                return a[1] - b[1];
            return b[0] - a[0];
        });
         int c = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++) {

            int d = arr[i][1];

            if(d < max)
                c++;

            max = Math.max(max, d);
        }

        return c;
    }
}