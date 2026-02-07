class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
    Solution t=new Solution();
    for(int x:arr1){
        t.insert(Integer.toString(x));
    } 
    int ans=0;
    for(int x:arr2){
        int c=t.search(Integer.toString(x));
        ans=Math.max(c,ans);
    }
    return ans;
    }
    class Node{
		char ch;
		boolean isterminal;
		HashMap<Character,Node>child;
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
		}
		
		curr.isterminal=true;
	}
	 public int search(String word) {
		 
		 Node curr=root;
         int c=0;
			for(int i=0;i<word.length();i++) {
				char ch=word.charAt(i);
				if(curr.child.containsKey(ch)) {
					curr=curr.child.get(ch);
					c++;
				}
				else {
					break;
				}
			}
			return c;
	    }
}