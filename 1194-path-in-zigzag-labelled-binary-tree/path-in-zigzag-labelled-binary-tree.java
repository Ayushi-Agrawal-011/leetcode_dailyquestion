class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> ans = new ArrayList<>();

        int level = 0;
        while (Math.pow(2, level) <= label) {
            level++;
        }

        while (level > 0) {
            ans.add(0, label);

            int start = (int) Math.pow(2, level - 1);
            int end = (int) Math.pow(2, level) - 1;

int reversedLabel = start + end - label;
            label = reversedLabel/2;
           
            level--;
        }

        return ans;
    }
}