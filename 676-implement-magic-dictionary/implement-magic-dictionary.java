class MagicDictionary {
Set<String> set;
    public MagicDictionary() {
        set=new HashSet<>();
    }
    
    public void buildDict(String[] dictionary) {
        set.clear();
        for(String t:dictionary){
            set.add(t);
        }
    }
    
    public boolean search(String searchWord) {
        for(String t:set){
            if(t.length()!=searchWord.length())
            continue;
            int diff=0;
            for(int i=0;i<t.length();i++){
                if(t.charAt(i)!=searchWord.charAt(i))
                diff++;
                if(diff>1)
                break;
            }
            if(diff==1)
            return true;

        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */