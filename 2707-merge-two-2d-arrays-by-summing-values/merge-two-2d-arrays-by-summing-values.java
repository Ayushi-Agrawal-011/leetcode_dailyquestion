class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
TreeMap<Integer,Integer> map=new TreeMap<>();
for(int i=0;i<nums1.length;i++){
    int a=nums1[i][0];
    int b=nums1[i][1];
    if(!map.containsKey(a)){
        map.put(a,b);
    }
    else{
     map.put(a,map.getOrDefault(a,0)+b);   
    }
}
for(int i=0;i<nums2.length;i++){
    int a=nums2[i][0];
    int b=nums2[i][1];
    if(!map.containsKey(a)){
        map.put(a,b);
    }
    else{
     map.put(a,map.getOrDefault(a,0)+b);   
    }
}
int [][] k=new int[map.size()][2];
int i=0;
for(int x:map.keySet()){
k[i][0]=x;
k[i][1]=map.get(x);
i++;
}
return k;
    }
}