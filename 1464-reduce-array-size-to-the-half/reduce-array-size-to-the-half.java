class Solution {
    public int minSetSize(int[] arr) {
  HashMap<Integer,Integer> map=new HashMap<>();

  for(int x:arr){
    map.put(x,map.getOrDefault(x,0)+1);
  }
  List<Integer> ll=new ArrayList<>(map.values());
  Collections.sort(ll,Collections.reverseOrder());
  int i=0;
  int r=arr.length/2;
  while(r>0){
    r-=ll.get(i);
    i++;
  }
  return i;
    }
}