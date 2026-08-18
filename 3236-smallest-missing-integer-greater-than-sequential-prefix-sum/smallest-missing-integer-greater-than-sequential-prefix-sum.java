class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums) {
            set.add(x);
        }

        int x = 0, d = 0;

        int key = nums[0];
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        x = sum;

        while(set.contains(x)) {
            x++;
        }

        return x;
    }
}