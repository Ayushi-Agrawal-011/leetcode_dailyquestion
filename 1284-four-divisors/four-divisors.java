class Solution {

    public int sumFourDivisors(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += isitpossible(nums[i]);
        }

        return sum;
    }

    static int isitpossible(int n) {

        int count = 0;
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                count++;
                sum += i;

                if (i != n / i) {
                    count++;
                    sum += n / i;
                }

                if (count > 4)
                    return 0;
            }
        }

        if (count == 4)
            return sum;

        return 0;
    }
}