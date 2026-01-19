class Solution {
    public int vowelConsonantScore(String s) {
        Set<Character> set=new HashSet<>();
        s.trim();
        char[] arr=s.toCharArray();
        set.add('a');
         set.add('e');
          set.add('i');
           set.add('o');
            set.add('u');
            int c=0,d=0;
     for(int i=0;i<arr.length;i++){
       if(arr[i]==' '){
                continue;
            }
            if(arr[i]>='0' && arr[i]<='9'){
                continue;
            }

        if( set.contains(arr[i]))
        c++;
        else
        d++;
     }   
     if(d>0)
     return(int) Math.floor(c/d);
     return 0;
    }
}