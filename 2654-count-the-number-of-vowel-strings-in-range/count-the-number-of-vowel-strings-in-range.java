class Solution {
    public int vowelStrings(String[] words, int left, int right) {
         Set<Character> set=new HashSet<>();
        set.add('a');
           set.add('e');
              set.add('i');
                 set.add('o'); 
                    set.add('u');

                    int[]c=new int[words.length];
                 char p=words[0].charAt(0);
                        char q=words[0].charAt(words[0].length()-1);
                        if(set.contains(p) && set.contains(q))
                        c[0]=1;
                    for(int i=1;i<words.length;i++){
                        char a=words[i].charAt(0);
                        char b=words[i].charAt(words[i].length()-1);
                      if(set.contains(a) && set.contains(b))
                        c[i]=c[i-1]+1;
                        else
                        c[i]=c[i-1];
                    }
                   
                    int i=0;
   int ans=0;    
if(left==0)
ans=c[right];
else
ans=c[right]-c[left-1];

                    
                    return ans;
    }
}