class Solution {
    public int numSplits(String s) {
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
int[]left=new int[s.length()];
int []right=new int[s.length()];
int n=s.length();
left[0]=1;
right[n-1]=1;

        set1.add(s.charAt(0));
        set2.add(s.charAt(s.length()-1));
        for(int i=1;i<s.length();i++){
if(!set1.contains(s.charAt(i))){
left[i]=left[i-1]+1;
set1.add(s.charAt(i));
}
else
left[i]=left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            if(!set2.contains(s.charAt(i))){
right[i]=right[i+1]+1;
set2.add(s.charAt(i));
}
else
right[i]=right[i+1];
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
if(left[i]==right[i+1]){
ans++;
}
//System.out.println(left[i]+" "+right[i]);
        }
        return ans;
    }
}