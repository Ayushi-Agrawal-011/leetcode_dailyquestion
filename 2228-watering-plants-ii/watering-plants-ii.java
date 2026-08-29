class Solution {
    public int minimumRefill(int[] arr, int capA, int capB) {
    int ans=0;
    int l=0,r=arr.length-1;
    int ra=capA,rb=capB;
    while(l<=r){
        if(l!=r){
     if(arr[l]<=capA){
        capA-=arr[l];

     }
     else{
capA=ra;
ans++;
capA-=arr[l];
     }
     if(arr[r]<=capB){
        capB-=arr[r];
     }
     else{
capB=rb;
ans++;
capB-=arr[r];
     }
        }
        else{
        
if( capA>=arr[l] && capA>=capB){
    capA-=arr[l];
}

else if(capB>=arr[l] && capB>=capA) {
    capB-=arr[l];
}
else{
    if(ra>=arr[l]){

        ans++;
    }
    else if(rb>=arr[l])
    ans++;
}
        }
l++;
r--;
    }

    return ans;
    }
}