class Solution {

    public int minimumLines(int[][] stockPrices) {

        Arrays.sort(stockPrices, (a, b) -> a[0] - b[0]);

        if (stockPrices.length == 1)
            return 0;

        int c = 1;

        long y1 = stockPrices[1][1] - stockPrices[0][1];
        long x1 = stockPrices[1][0] - stockPrices[0][0];

        for (int i = 2; i < stockPrices.length; i++) {

            long y2 = stockPrices[i][1] - stockPrices[i-1][1];
            long x2 = stockPrices[i][0] - stockPrices[i-1][0];

            if (y2 * x1 != y1 * x2) {
                c++;
                y1 = y2;
                x1 = x2;
            }
        }

        return c;
    }
}