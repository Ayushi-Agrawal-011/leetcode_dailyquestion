class Solution {
    public int openLock(String[] deadends, String endWord) {
        String beginWord="0000";

      Queue<Pair> q=new LinkedList<>();
q.add(new Pair(beginWord,0));
   Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if (dead.contains(beginWord)) return -1;

Set<String> visited = new HashSet<>();
  visited.add(beginWord)  ;
  while(!q.isEmpty()){
    Pair rp=q.poll();
    char[]word=rp.cur.toCharArray();
    if(rp.cur.equals(endWord))
    return rp.step;
 
    for(int i=0;i<4;i++){
        char ch=word[i];
      word[i]=ch=='9'?'0': (char)(ch + 1);
      String changed=new String(word);
       
                if (!dead.contains(changed) && !visited.contains(changed)) {
                    visited.add(changed);
                    q.add(new Pair(changed, rp.step + 1));
                }
                 word[i]=ch=='0'?'9':(char)(ch - 1);
     changed=new String(word);
       
                if (!dead.contains(changed) && !visited.contains(changed)) {
                    visited.add(changed);
                    q.add(new Pair(changed, rp.step + 1));
                }
        word[i]=ch;
    }

  }
  return -1;
}
    }
   class Pair{
    String cur;
    int step;
    public Pair(String cur,int step){
        this.cur=cur;
        this.step=step;
    
    }
}