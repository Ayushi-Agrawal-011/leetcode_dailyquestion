class Solution {
    public int slidingPuzzle(int[][] board) {
             int[][] directions=new int[][]{{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
        String beginWord="";
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                beginWord+=board[i][j];
            }
        }
   
      String  endWord="123450";
     Queue<Pair> q=new LinkedList<>();
q.add(new Pair(beginWord,0));
Set<String> visited=new HashSet<>();
visited.add(beginWord);
  while(!q.isEmpty()){
    Pair rp=q.poll();
    char[]word=rp.cur.toCharArray();
    if(rp.cur.equals(endWord))
    return rp.step;
     int zero= rp.cur.indexOf('0');
     for(int nbrs:directions[zero]){
     swap(word,zero,nbrs);
      String changed=new String(word);
      if(!visited.contains(changed)){
        q.add(new Pair(changed,rp.step+1));
        visited.add(changed);
      }
      swap(word,nbrs,zero);}
    }
  return -1;
  }


    
    public void swap(char[] arr,int zero,int nbrs){
char temp=arr[zero];
arr[zero]=arr[nbrs];
arr[nbrs]=temp;
    }
   class Pair{
    String cur;
    int step;
    public Pair(String cur,int step){
        this.cur=cur;
        this.step=step;
    }
     
    
}}