class Solution {
    public int[] memLeak(int memory1, int memory2) {
      
      int[]ans=new int[3];
int sec=1;
while(true){
    if(memory1>=memory2 && memory1>=sec){
        memory1-=sec;
    }
    else if(memory2>memory1 && memory2>=sec)
    memory2-=sec;
    else
    break;
    sec++;
}
ans[0]=sec;
ans[1]=memory1;
ans[2]=memory2;
      return ans;

        
    }
}