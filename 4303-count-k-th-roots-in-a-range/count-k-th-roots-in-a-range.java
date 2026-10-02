class Solution {
    public int countKthRoots(int l, int r, int k) {
 int low = 0;
        int high = r;
        int left = -1;
        int right = -1;

        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (Math.pow(mid, k) >= l) {
                left = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

      
        low = 0;
        high = r;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (Math.pow(mid, k) <= r) {
                right = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (left == -1 || right == -1 || left > right)
            return 0;

        return right - left + 1;
    }
}