class Solution {
    static List<String> ll;
    public List<String> findWords(char[][] maze, String[] words) {
        Trie t= new Trie();
        ll=new ArrayList<>();
		for(String s:words) {
			t.insert(s);
		}
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				if(t.root.child.containsKey(maze[i][j]))
					t.Search(maze,i,j,t.root);
			}
		}
        return ll;
    }
    static class Trie {

	        class Node {
	            char ch;
	            String isterminal;
	            HashMap<Character, Node> child;

	            public Node(char ch) {
	                this.ch = ch;
	                child = new HashMap<>();
	            }
	        }

	       private  Node root;

	        public Trie() {
	            root = new Node('*');
	        }

	        public void insert(String word) { // O(word.length)
	            Node curr = root;

	            for (int i = 0; i < word.length(); i++) {
	                char ch = word.charAt(i);

	                if (!curr.child.containsKey(ch)) {
	                    curr.child.put(ch, new Node(ch));
	                }
	                curr = curr.child.get(ch);
	            }

	            curr.isterminal = word;
	        }
	        public void Search(char[][]maze,int i,int j,Node node) {
	        	if(i<0 || j<0 || j>=maze[0].length || i>=maze.length || !node.child.containsKey(maze[i][j]))
	        		return;
	        	char ch=maze[i][j];
	        	node=node.child.get(ch);
	        	if(node.isterminal!=null) {
	        		ll.add(node.isterminal);
	        		node.isterminal=null;
	        	}
	        	maze[i][j]='*';
	        	Search(maze,i+1,j,node);
	        	Search(maze,i-1,j,node);
	        	Search(maze,i,j+1,node);
	        	Search(maze,i,j-1,node);
	        	maze[i][j]=ch;
	        }
	        }
}