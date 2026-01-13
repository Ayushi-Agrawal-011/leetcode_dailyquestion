class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
     
        int[]ans=new int[n];
        for(int i=0;i<bookings.length;i++){
            int a=bookings[i][0]-1;
            int b=bookings[i][1]-1;
            int c=bookings[i][2];
            for(int j=a;j<=b;j++){
                ans[j]+=c;
            }
        }
       
        return ans;
    }
}