class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)
        return false;
    int stones=n-10;
    int last=9;
    int turn=1;
    while(true){

        if(stones<last ){
            if(turn==1)
            return true;
            else
            return false;
        }

stones-=last;
last--;
turn =1-turn;

    }
       
    }
}