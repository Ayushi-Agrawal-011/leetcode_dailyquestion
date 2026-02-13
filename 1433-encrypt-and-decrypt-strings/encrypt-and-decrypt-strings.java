class Encrypter {
 HashMap<Character,String> map=new HashMap<>();
 HashMap<String,Integer> mp=new HashMap<>();
    public Encrypter(char[] keys, String[] values, String[] dictionary) {
     map=new HashMap<>();
     for(int i=0;i<keys.length;i++){
        map.put(keys[i],values[i]);
     } 
  mp=new HashMap<>();
  for(String x:dictionary){
     String e = encrypt(x);
            mp.put(e, mp.getOrDefault(e, 0) + 1);
  }
    }
    
    public String encrypt(String word1) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word1.length();i++){
            sb.append(map.getOrDefault(word1.charAt(i),"#"));
        }
        return sb.toString();
    }
    
    public int decrypt(String word2) {
     return mp.getOrDefault(word2, 0);   
    }
}

/**
 * Your Encrypter object will be instantiated and called as such:
 * Encrypter obj = new Encrypter(keys, values, dictionary);
 * String param_1 = obj.encrypt(word1);
 * int param_2 = obj.decrypt(word2);
 */