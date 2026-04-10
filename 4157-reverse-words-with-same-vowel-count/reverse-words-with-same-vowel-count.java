class Solution {
    public String reverseWords(String s) {
        String[]arr=s.split("\\s+");
        int res=isvowels(arr[0]);
       for(int i=1;i<arr.length;i++){
        int count=isvowels(arr[i]);
        if(count==res){
            StringBuilder sb=new StringBuilder(arr[i]);
            sb.reverse();
            arr[i]=sb.toString();
        }

       } 
     String result = String.join(" ", arr);
      return result;

    }
    public int isvowels(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u')
            c++;
        }
        return c;
    }
}