class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> ans = new ArrayList<>();
     for(int i=left;i<=right;i++){
        if(fn(i))
        ans.add(i);
     }   
     return ans;
    }
    public boolean fn(int n){
        int k=n;
        while(n>0){
     int ld=n%10;
     if(ld==0)
     return false;
     if(k%ld!=0)
     return false;
     n/=10;
        }
        return true;
    }
}