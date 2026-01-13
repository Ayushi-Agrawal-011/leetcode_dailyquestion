class Solution {
    public int minSessions(int[] tasks, int sessionTime) {
        Arrays.sort(tasks);
       int lo=1;
       int high=tasks.length;
       int ans=-1;
       while(lo<=high){
        int mid=lo+(high-lo)/2;
        int[] time = new int[mid] ;
        if(isitpossible(tasks,0,sessionTime,time)){
            ans=mid;
            high=mid-1;
        }
        else
        lo=mid+1;
       }
       return ans;
    }
    public boolean isitpossible(int[]tasks,int j,int sessiontime,int[]time){
        if(j>=tasks.length)
        return true;
        for(int i=0;i<time.length;i++){
            if(time[i]+tasks[j]<=sessiontime){
                time[i]+=tasks[j];
                if(isitpossible(tasks,j+1,sessiontime,time))
                return true;
                time[i]-=tasks[j];
            }
            if(time[i]==0)
            break;
        }
        return false;
    }
}