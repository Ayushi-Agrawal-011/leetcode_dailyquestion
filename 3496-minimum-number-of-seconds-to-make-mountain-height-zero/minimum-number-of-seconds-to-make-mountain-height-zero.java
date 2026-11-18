class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
           long low = 1;
         long maxWorkerTime = 0;

        for (int x : workerTimes) {
            maxWorkerTime = Math.max(maxWorkerTime, x);
        }
long high = (long) maxWorkerTime * mountainHeight * (mountainHeight + 1) / 2;
  long ans=high;
while(low<=high){
    long mid=low+(high-low)/2;
    long total=fn(mountainHeight,workerTimes,mid);
    if(total>=mountainHeight){
        ans=mid;
        high=mid-1;
    }
    else
    low=mid+1;
}
return ans;
    }
   public long fn(int mountainHeight, int[] workerTimes, long mid) {
        long t = 0;

        for (int x : workerTimes) {
            long low = 0;
            long high = mountainHeight;
            long h = 0;

            while (low <= high) {
                long m = low + (high - low) / 2;

                long time = (long) x * m * (m + 1) / 2;

                if (time <= mid) {
                    h = m;
                    low = m + 1;
                } else {
                    high = m - 1;
                }
            }

            t += h;

            if (t >= mountainHeight) {
                break;
            }
        }

        return t;
    }
}