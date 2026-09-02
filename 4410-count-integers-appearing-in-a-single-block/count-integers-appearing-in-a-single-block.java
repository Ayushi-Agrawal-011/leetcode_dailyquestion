class Solution {
    public int countSpecialIntegers(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        if(nums.length==2 &&nums[0]==nums[1])
        return 1;
          if(nums.length==2 &&nums[0]!=nums[1])
        return 2;
     
      Set<Integer> set=new HashSet<>() ;
        Set<Integer> bad=new HashSet<>(); 
      int c=0;
      for(int i=0;i<nums.length;i++){
        if(i==0){
            c=nums[i];
            continue;
        }
if(  nums[i]==nums[i-1]){
   continue;
}

            if(!bad.contains(c))
                set.add(c);

if(set.contains(nums[i])){
set.remove(nums[i]);
  bad.add(nums[i]); 
}
c=nums[i];

      } 
 
if(!bad.contains(c)){               // NEW
            if(set.contains(c)) 
                set.remove(c); 
            else 
                set.add(c);
        }
      return set.size();
    }
}