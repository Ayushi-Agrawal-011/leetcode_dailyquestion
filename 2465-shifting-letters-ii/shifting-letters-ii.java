class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
   int[]arr=new int[n+1];
       for(int i=0;i<shifts.length;i++){
        int si=shifts[i][0];
        int ei=shifts[i][1];
        int d=shifts[i][2];
        if(d==1){
          arr[si]++;
          arr[ei+1]--;
        }
        else{
          arr[si]--;
          arr[ei+1]++;  
        }
               }
              char[]arr1=s.toCharArray();
              int so=0;
              for(int i=0;i<n;i++){
                so+=arr[i];
                int nc=(arr1[i]-'a'+so)%26;
                if(nc<0)
                nc+=26;
                arr1[i] = (char) ('a' + nc);
              }
              return new String(arr1);  
    }
}