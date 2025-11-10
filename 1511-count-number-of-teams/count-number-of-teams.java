class Solution {
    public int numTeams(int[] arr) {
     int n = arr.length;
        int ans = 0;

        for (int j = 0; j < n; j++) {
            int leftSmaller = 0, rightLarger = 0;
            int leftLarger = 0, rightSmaller = 0;

            for (int i = 0; i < j; i++) {
                if (arr[i] < arr[j]) leftSmaller++;
                else if (arr[i] > arr[j]) leftLarger++;
            }

            for (int k = j + 1; k < n; k++) {
                if (arr[k] > arr[j]) rightLarger++;
                else if (arr[k] < arr[j]) rightSmaller++;
            }

       
            ans += leftSmaller * rightLarger;

            ans += leftLarger * rightSmaller;
        }

        return ans;}
}