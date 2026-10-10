class Solution {
    public boolean hasMatch(String s, String p) {
   String[] arr = p.split("\\*", -1);

        int i = s.indexOf(arr[0]);
        if (i == -1) return false;

        int j = s.indexOf(arr[1], i + arr[0].length());
        if (j == -1) return false;

        return isSubsequence(arr[0] + arr[1], s);

    }
      public boolean isSubsequence(String a, String b) {
        int i = 0, j = 0;

        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == a.length();
    }
}