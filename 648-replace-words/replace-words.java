class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
         Trie t = new Trie();

        for (String s : dictionary) {
            t.insert(s);
        }

     
        String[] arr = sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++) {
        	sb.append(t.search(arr[i])+" ");
        }
    return sb.toString().trim();
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

        private Node root;

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
        public   String search(String word) {
        	Node curr=root;
        	for(int i=0;i<word.length();i++) {
        		char ch=word.charAt(i);
        		if(curr.child.containsKey(ch)) {
        			curr=curr.child.get(ch);
        			if(curr.isterminal!=null) {
        				return curr.isterminal;
        			}
        		}
        		else
        			return word;
        	}
        	
        	 return word;
        }
       
    }
}