class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int[] indeg = new int[n];

        for (int i = 0; i < n; i++)
            map.put(i, new ArrayList<>());

        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                map.get(i).add(leftChild[i]);
                indeg[leftChild[i]]++;
                if (indeg[leftChild[i]] > 1) return false; // multiple parent
            }
            if (rightChild[i] != -1) {
                map.get(i).add(rightChild[i]);
                indeg[rightChild[i]]++;
                if (indeg[rightChild[i]] > 1) return false;
            }
        }
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (indeg[i] == 0) {
                if (root != -1) return false; // multiple roots
                root = i;
            }
        }

        if (root == -1) return false;
         boolean[] visited = new boolean[n];
        dfs(root, map, visited);

        for (boolean v : visited)
            if (!v) return false;

        return true;
    }
     private void dfs(int node, HashMap<Integer, List<Integer>> map, boolean[] visited) {
        if (visited[node]) return;
        visited[node] = true;
        for (int nei : map.get(node)) {
            dfs(nei, map, visited);
        }}
    }