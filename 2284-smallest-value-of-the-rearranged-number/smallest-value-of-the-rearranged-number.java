class Solution {
    public long smallestNumber(long n) {
         if (n == 0) return 0;

        boolean neg = n < 0;
        n = Math.abs(n);

      List<Long> ll=new ArrayList<>();
   
    while(n>0){
        long r=n%10;
        ll.add(r);
        n=n/10;
    }
   

  Collections.sort(ll);

        if (!neg) {
            // First digit cannot be 0
            if (ll.get(0) == 0) {
                int idx = 0;

                while (ll.get(idx) == 0) {
                    idx++;
                }

                // Swap first zero with first non-zero
                long temp = ll.get(0);
                ll.set(0, ll.get(idx));
                ll.set(idx, temp);
            }
        } else {
            // For negative number, largest arrangement gives
            // smallest numerical value
            Collections.reverse(ll);
        }

        long ans = 0;

        for (long x : ll) {
            ans = ans * 10 + x;
        }

        return neg ? -ans : ans;

    }
}