class Solution {
    public String pushDominoes(String dominoes) {
        char []arr=dominoes.toCharArray();
        int[]left=new int[arr.length];
        int[]right=new int[arr.length];
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='R')
            c=1;
            else if(arr[i]=='L')
            c=0;
            if(c>0 && arr[i]=='.')
            c++;
            right[i]=c;
        }
        c=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='L')
            c=1;
            else if(arr[i]=='R')
            c=0;
            if(c>0 && arr[i]=='.')
            c++;
            left[i]=c;
        }
        StringBuilder sb=new StringBuilder();
         for(int i=0;i<arr.length;i++){
              if(right[i]== 0 && left[i]>0){
                sb.append('L');
            }
            else if(left[i]==0 && right[i]>0){
                sb.append('R');
            }
       else if(left[i]==right[i]){
                sb.append('.');
            }
            else if(left[i]>right[i]){
                sb.append('R');
            }
            else{
                sb.append('L');
            }
         }
         return sb.toString();
    }
}