class Solution {
    public int secondsBetweenTimes(String sa, String ea) {
       String []st=sa.split(":");
       String []et=ea.split(":");
       int t1=0,t2=0;

       t1+=Integer.parseInt(st[0])*60*60;
       t1+=Integer.parseInt(st[1])*60;
        t1+=Integer.parseInt(st[2]);
         t2+=Integer.parseInt(et[0])*60*60;
       t2+=Integer.parseInt(et[1])*60;
        t2+=Integer.parseInt(et[2]);
        return t2-t1;

    }
}