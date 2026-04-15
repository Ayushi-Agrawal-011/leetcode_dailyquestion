class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int idx=-1,i=0,ans=Integer.MAX_VALUE;
        int n=words.length;
     for(String s:words){
        if(s.equals(target)){
int r=(i-startIndex+n)%n;
int l=(startIndex-i+n)%n;
ans=Math.min(ans,Math.min(r,l));
        }
        i++;
     }
     return  ans==Integer.MAX_VALUE?-1:ans; 
    }
}