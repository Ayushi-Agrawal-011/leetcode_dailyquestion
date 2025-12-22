class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        HashMap<Integer,String[]> map=new HashMap<>();
        for(int i=0;i<indices.length;i++){
            if(s.startsWith(sources[i],indices[i])){
            map.put(indices[i],new String[]{
                sources[i],targets[i]
            });
            }
        }
          StringBuilder sb = new StringBuilder();
	
       for(int i=0;i<s.length();i++){
        if(map.containsKey(i)){
             String[] pair = map.get(i); 
                String src = pair[0];
                String target = pair[1];
            
             sb.append(target);
             i+=(src.length()-1);
        }
       
       else
       sb.append(s.charAt(i));
        }  
      
      
        
        return sb.toString();
    }
}