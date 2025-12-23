class Solution {
    public String arrangeWords(String text) {
            text=text.trim();
            HashMap<Integer,List<String>> map=new HashMap<>();
            String[]arr=text.split("\\s+");
            int len=0;
            for(int i=0;i<arr.length;i++){
                int k=arr[i].length();
                len=Math.max(k,len);
                if(!map.containsKey(k))
                map.put(k,new ArrayList<>());
                map.get(k).add(arr[i]);
            } 
            StringBuilder sb=new StringBuilder();
            int c=0;
            for(int i=1;i<=len;i++){
                if(map.containsKey(i)){
                    for(String v:map.get(i)){
                        c++;
                        if(c==1){
                             sb.append(Character.toUpperCase(v.charAt(0)));
                        sb.append(v.substring(1));
               sb.append(" ");
                       
                        }
                        else{
               sb.append(v.toLowerCase());
               sb.append(" ");
                        }
                    }
                }
            }
            
            return sb.toString().trim();
    }
}