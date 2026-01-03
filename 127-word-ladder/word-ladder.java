class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        HashSet<String>visited=new HashSet<>(wordList);
        if(visited.contains(beginWord))
        visited.remove(beginWord);
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty()){
            Pair rp=q.poll();
            char[]word=rp.cur.toCharArray();
            if((rp.cur).equals(endWord))
            return rp.steps;
            for(int i=0;i<word.length;i++){
                char p=word[i];
                for(char ch='a';ch<='z';ch++){
                    if(p==ch)
                    continue;
                    word[i]=ch;
                    String changed=new String(word);
                    if(visited.contains(changed)){
                        q.add(new Pair(changed,rp.steps+1));
                        visited.remove(changed);
                    }
                    word[i]=p;
                }
            }
        }
        return 0;
    }
    class Pair{
        String cur;
        int steps;
        public Pair(String cur,int steps){
            this.cur=cur;
            this.steps=steps;
        }
    }
}