import java.util.*;

class LockingTree {

    static class Node {
        int val;
        Node parent;
        List<Node> children;

        boolean isLocked;
        int lockedBy;

        Node(int val) {
            this.val = val;
            parent = null;
            children = new ArrayList<>();
            isLocked = false;
            lockedBy = -1;
        }
    }

    Node[] nodes;

    public LockingTree(int[] parent) {

        int n = parent.length;
        nodes = new Node[n];

        for (int i = 0; i < n; i++)
            nodes[i] = new Node(i);

        for (int i = 1; i < n; i++) {
            nodes[i].parent = nodes[parent[i]];
            nodes[parent[i]].children.add(nodes[i]);
        }
    }

    private boolean hasAncestors(Node node) {

        Node curr = node.parent;

        while (curr != null) {
            if (curr.isLocked)
                return true;
            curr = curr.parent;
        }

        return false;
    }

    private void collect(Node node, List<Node> list) {

        for (Node child : node.children) {

            if (child.isLocked)
                list.add(child);

            collect(child, list);
        }
    }

    public boolean lock(int num, int user) {

        Node node = nodes[num];

        if (node.isLocked)
            return false;

        node.isLocked = true;
        node.lockedBy = user;

        return true;
    }

    public boolean unlock(int num, int user) {

        Node node = nodes[num];

        if (!node.isLocked || node.lockedBy != user)
            return false;

        node.isLocked = false;
        node.lockedBy = -1;

        return true;
    }

    public boolean upgrade(int num, int user) {

        Node node = nodes[num];

        if (node.isLocked)
            return false;

        if (hasAncestors(node))
            return false;

        List<Node> lockedNodes = new ArrayList<>();
        collect(node, lockedNodes);

        if (lockedNodes.size() == 0)
            return false;

        for (Node x : lockedNodes) {
            x.isLocked = false;
            x.lockedBy = -1;
        }

        node.isLocked = true;
        node.lockedBy = user;

        return true;
    }
}