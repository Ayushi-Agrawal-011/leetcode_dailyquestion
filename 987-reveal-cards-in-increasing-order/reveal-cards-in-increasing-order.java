class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[]ans=new int[deck.length];
        Arrays.sort(deck);
          Deque<Integer> q=new ArrayDeque<>();
          for(int i=deck.length-1;i>=0;i--){
            if(!q.isEmpty()){
          int r=q.removeFirst();
          q.add(r);
            }
            q.add(deck[i]);
          }
          int i=0;
          while(!q.isEmpty()){
            ans[i]=q.removeLast();
            i++;
          }
          return ans;
    }
}