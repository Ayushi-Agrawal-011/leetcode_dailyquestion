class Solution {
    public int findMinFibonacciNumbers(int k) {
    List<Integer> fib=new ArrayList<>();
fib.add(1);
fib.add(1);

while(fib.get(fib.size()-1)<k){
    int a=fib.get(fib.size()-1)+fib.get(fib.size()-2);
    fib.add(a);
 

}
int ans=0;
int i=fib.size()-1;
while(k>0){
    int x=fib.get(i);
    if(x>k)
    i--;
  else if(x==k || x<k){
    k-=fib.get(i);
    ans++;
i--;
  }
}
return ans;
    }

}