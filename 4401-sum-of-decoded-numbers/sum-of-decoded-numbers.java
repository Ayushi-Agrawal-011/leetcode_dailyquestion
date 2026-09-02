class Solution {
    static int mod = 1000000007;

    public int sumDecoded(long[] nums) {
        long sum = 0;

        for(long x : nums){
            long width = x % 10;
            long d = x / 10;

            String s = String.valueOf(d);
            long a = Long.parseLong(s.substring(0, (int)width));
            long b = Long.parseLong(s.substring((int)width));

            long ans = 1;
            a %= mod;

            while(b > 0){
                if(b % 2 == 1)
                    ans = (ans * a) % mod;

                a = (a * a) % mod;
                b /= 2;
            }

            sum = (sum + ans) % mod;
        }

        return (int)sum;
    }
}