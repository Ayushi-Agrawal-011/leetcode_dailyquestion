class Solution {
    public int[] sumPrefixScores(String[] words) {
       Solution  t=new Solution();
     for(String x:words){
      t.insert(x);
     }
     int[]ans=new int[words.length];
    for(int i=0;i<words.length;i++){
        ans[i]=t.count(words[i]);
    }
    return ans;
    }
    class Node{
		char ch;
		boolean isterminal;
		HashMap<Character,Node>child;
        int count=0;
		public Node(char ch) {
			this.ch=ch;
			child=new HashMap<>();
		}
		
	}
	private Node root;
	public Solution() {
		root=new Node('*');
	}
	public void insert(String word) { //O(word.length)
		Node curr=root;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
				
			}
			else {
				Node nn=new Node(ch);
				curr.child.put(ch, nn);
				curr=nn;
			}
            curr.count++;
		}
		
		curr.isterminal=true;
	}
    public int count(String word){
        int sum=0;
        Node curr=root;
        for(int i=0;i<word.length();i++){
            curr=curr.child.get(word.charAt(i));
            sum+=curr.count;
        }
        return sum;
    }
}