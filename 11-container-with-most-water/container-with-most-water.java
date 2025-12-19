class Solution {
    public int maxArea(int[] height) {
     int maxi=0;
     int i=0,j=height.length-1;
     while(i<j){
        int w=j-i;
        int h=Math.min(height[i],height[j]);
         maxi=Math.max(maxi,h*w);
        if(height[i]<height[j])
        i++;
        else
        j--;
     }   
     return maxi;
    }
}