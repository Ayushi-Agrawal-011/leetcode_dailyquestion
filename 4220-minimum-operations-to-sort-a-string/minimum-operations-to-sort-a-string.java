class Solution {
    public int minOperations(String s) {
       int n=s.length();
     char[]arr=s.toCharArray();
     
     Arrays.sort(arr);
     int i=0;
     int sorted=0;
     for(char ch:s.toCharArray()){
if(ch==arr[i])
sorted++;
i++;

     }
     if(sorted==s.length())
return 0;
if(s.length()==2)
return -1;
char mn=arr[0];
char mx=arr[s.length()-1];
if(s.charAt(0)==mn || s.charAt(n-1)==mx)
return 1;
if(s.lastIndexOf(mx)==0 && s.indexOf(mn)==n-1)
return 3;
return 2;
    }
}