class Bitset {
char[]arr;
  
int c=0;
int s;
  boolean f=false;
    public Bitset(int size) {
    arr=new char[size];
     Arrays.fill(arr, '0');
    s=size;
    }
    
    public void fix(int idx) {
         if((!f && arr[idx]!='1') || (f && arr[idx]!='0')){
            arr[idx]= f ? '0' : '1';
            c++;
        }
    }
    
    public void unfix(int idx) {
         if ((!f && arr[idx]=='1') || (f && arr[idx]=='0')) {
        arr[idx] = f ? '1' : '0';
        c--;
    }
    }
    
   
     public void flip() {
        f=!f;
        c=s-c;
    }
    public boolean all() {
    return c==s;    
    }
    
    public boolean one() {
        return c>=1;
    }
    
    public int count() {
        return c;
    }
    
    public String toString() {
      StringBuilder sb=new StringBuilder();
        for(char ch:arr){
            sb.append(f ? (ch=='0'?'1':'0') : ch);
        }
        return sb.toString();
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */