// class Solution {
//     public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
//         boolean[][] isreserved=new boolean[n][10];
//         for(int[]r:reservedSeats){
//             isreserved[r[0]-1][r[1]-1]=true;

//         }
//         int ans=0;
//         for(int i=0;i<n;i++){
//             int c=0;
//             for(int j=1;j<5;j++){
//                 if(isreserved[i][j])
//                 break;
//                 else{
//                      isreserved[i][j]=true;
//                 c++;
//                 }
//             }
//             if(c==4)
//             ans++;
//             c=0;
//             for(int j=3;j<7;j++){
//                 if(isreserved[i][j])
//                 break;
//                 else{
//                     isreserved[i][j]=true;
//                 c++;
//                 }
//             }
//              if(c==4)
//             ans++;
//             c=0;
//              for(int j=5;j<9;j++){
//                 if(isreserved[i][j])
//                 break;
//                 else{
//                      isreserved[i][j]=true;
//                 c++;
//                 }
//             }
//             if(c==4)
//             ans++;
//         }
//     return ans;

//     }
// }
class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, boolean[]> map = new HashMap<>();

        for (int[] r : reservedSeats) {
            map.putIfAbsent(r[0], new boolean[10]);
            map.get(r[0])[r[1] - 1] = true;
        }

        int ans = (n - map.size()) * 2;

        for (boolean[] isreserved : map.values()) {

            int c = 0;

            // seats 2-5
            for (int j = 1; j < 5; j++) {
                if (isreserved[j])
                    break;
                else {
                    isreserved[j] = true;
                    c++;
                }
            }

            if (c == 4)
                ans++;

            c = 0;

            // seats 4-7
            for (int j = 3; j < 7; j++) {
                if (isreserved[j])
                    break;
                else {
                    isreserved[j] = true;
                    c++;
                }
            }

            if (c == 4)
                ans++;

            c = 0;

            // seats 6-9
            for (int j = 5; j < 9; j++) {
                if (isreserved[j])
                    break;
                else {
                    isreserved[j] = true;
                    c++;
                }
            }

            if (c == 4)
                ans++;
        }

        return ans;
    }
}