class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> ll:knowledge){
            map.put(ll.get(0),ll.get(1));
        }
        System.out.println(map);
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
      int i=0;
      while(i<s.length()){
        if(s.charAt(i)=='('){
            StringBuilder p=new StringBuilder();
            i++;
      while(i<s.length() && s.charAt(i)!=')'){
        p.append(s.charAt(i));
        i++;
      }
   //   p.reverse();
if(map.containsKey(p.toString()))
sb.append(map.get(p.toString()));
else
sb.append('?');
        }
        else
        sb.append(s.charAt(i));
        i++;
      }

        
return sb.toString();
    }
}