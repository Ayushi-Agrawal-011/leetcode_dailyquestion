class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
Queue<Pair> q=new LinkedList<>();
q.add(new Pair(beginWord,1));
Set<String> visited=new HashSet<>(wordList);

  visited.remove(beginWord)  ;
  while(!q.isEmpty()){
    Pair rp=q.poll();
    char[]word=rp.cur.toCharArray();
    if(rp.cur.equals(endWord))
    return rp.step;
    for(int i=0;i<word.length;i++){
        char ch=word[i];
        for(char p='a';p<='z';p++){
            if(p==ch)
            continue;
            word[i]=p;
            String changed=new String(word);
            if(visited.contains(changed)){
                q.add(new Pair(changed,rp.step+1));
                visited.remove(changed);
            }
        }
        word[i]=ch;
    }

  }
  return 0;
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