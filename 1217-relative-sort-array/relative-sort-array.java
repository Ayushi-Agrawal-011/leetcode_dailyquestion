class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr1){
            if(map.containsKey(x))
            map.put(x,map.get(x)+1);
            else
            map.put(x,1);
        }
        int[] ans = new int[arr1.length];
        int c=0;
        for(int x:arr2){
     while(map.get(x)>0){
        ans[c]=x;
        c++;
        map.put(x,map.get(x)-1);

     }
     map.remove(x);
        }
        int[] remaining=new int[arr1.length-c];
    int index = 0;
for (int j : arr1) {
    if (map.containsKey(j)) {
        while (map.get(j) > 0) {
            remaining[index] = j;
            index++;
            map.put(j, map.get(j) - 1);
        }
        map.remove(j);
    }
}
Arrays.sort(remaining);
for (int j : remaining) {
    ans[c] = j;
    c++;
}
return ans;
    }
}