class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
      int xor1=  doesValidArrayExist(arr1);
      int xor2=doesValidArrayExist(arr2);
      return xor1 & xor2;
    }
      public int doesValidArrayExist(int[] derived) {
        int xor=0;
        for(int i=0;i<derived.length;i++){
            xor^=derived[i];
        }
        return xor;
    }

}