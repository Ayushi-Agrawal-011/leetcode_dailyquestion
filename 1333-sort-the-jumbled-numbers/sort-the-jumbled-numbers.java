class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
HashMap<Character, Character> map = new HashMap<>();
HashMap<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<=9;i++){
          map.put((char)('0' + i), (char)('0' + mapping[i]));
      
       }
        for (int i = 0; i <nums.length; i++) {

            String s = String.valueOf(nums[i]);
            StringBuilder rotated = new StringBuilder();
            boolean valid = true;

            for (char ch : s.toCharArray()) {
                
                rotated.append(map.get(ch));
            }
             mp.put(nums[i],Integer.parseInt(rotated.toString()));
         
        }
        
  Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> mp.get(a) - mp.get(b));

     
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
       
    }
}