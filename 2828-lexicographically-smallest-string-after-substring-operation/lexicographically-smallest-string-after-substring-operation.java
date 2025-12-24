class Solution {
    public String smallestString(String s) {
  char []arr=s.toCharArray();
  int i=0;
  while(i<arr.length && arr[i]=='a'){
    i++;
  }
  if(i==arr.length)
arr[i-1]='z';
else{
    while(i<arr.length){
        if(arr[i]=='a')
        break;
        arr[i]=(char)(arr[i]-1);
        i++;
    }
}
return new String(arr);

    }
}