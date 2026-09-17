class Solution {
    public int maxTurbulenceSize(int[] arr) {
         if(arr.length <= 1)
            return arr.length;

        int max1 = 1, max2 = 1;
        int count1 = 1, count2 = 1;

        for(int i = 1; i < arr.length; i++) {

            if(i % 2 == 0) {

                count1 = arr[i - 1] > arr[i] ? count1 + 1 : 1;
                count2 = arr[i - 1] < arr[i] ? count2 + 1 : 1;

            } else {

                count1 = arr[i - 1] < arr[i] ? count1 + 1 : 1;
                count2 = arr[i - 1] > arr[i] ? count2 + 1 : 1;

            }

            max1 = Math.max(max1, count1);
            max2 = Math.max(max2, count2);
        }

        return Math.max(max1, max2);
    }
}