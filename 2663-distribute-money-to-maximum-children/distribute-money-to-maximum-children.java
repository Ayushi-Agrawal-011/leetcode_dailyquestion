class Solution {
    public int distMoney(int money, int children) {
      if(money<children)
      return -1;
      money-=children;
      int ans=0;
      while(money-7>=0 && children>0){
        money-=7;//3 1 2
        children--;
        ans++;
      }
      if((children==1 && money==3)||(children==0 && money>0))
      ans--;
      return ans;
    }
}