class Solution {
    public int getMaximumConsecutive(int[] coins) {
        int curr=0;
        int key=0;
        Arrays.sort(coins);
       
        for (int x : coins) {
            if (x > curr + 1)
                break;

            curr += x;
        }

        return curr + 1;
    }
}