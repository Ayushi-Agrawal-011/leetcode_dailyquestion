import java.util.*;
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        ArrayList<Integer> ll=new ArrayList<>();
          for(int i=0;i<capacity.length;i++){
            ll.add(capacity[i]);
        }
        Collections.sort(ll, Collections.reverseOrder());
   
       
        int boxes=0;
        while(sum>0){
            sum-=ll.get(boxes);
            boxes++;
        }
        return boxes;
    }
}