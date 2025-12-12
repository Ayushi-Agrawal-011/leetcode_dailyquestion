class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ll=new ArrayList<>();
        l(n,0,ll);
        ll.remove(0);
        return ll;
    }
    public void l(int n,int curr,List<Integer> ll){
if(curr>n)
return;
ll.add(curr);
int i=0;
if(curr==0)
i=1;
while(i<=9){
    l(n,curr*10+i,ll);
    i++;
}
    }
}