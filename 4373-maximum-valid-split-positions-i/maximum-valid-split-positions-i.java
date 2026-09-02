class Solution { 
    public int maxValidSplits(int[] nums) { 
        int n=nums.length;
        int ans=0;

        for(int remove=-1;remove<n;remove++){

            int m=n-(remove==-1?0:1);
            int[] arr=new int[m];
            int k=0;

            for(int i=0;i<n;i++){
                if(i!=remove)
                    arr[k++]=nums[i];
            }

            if(m<2)
                continue;

            int[] left=new int[m]; 
            int[] right=new int[m]; 

            left[0]=arr[0]; 
            right[m-1]=arr[m-1]; 

            for(int i=1;i<m;i++){ 
                left[i]=gcd(left[i-1],arr[i]); 
            } 

            for(int i=m-2;i>=0;i--){ 
                right[i]=gcd(right[i+1],arr[i]); 
            } 

            int c=0; 

            for(int i=0;i<m-1;i++){ 
                if(left[i]==right[i+1])
                    c++;
            }

            ans=Math.max(ans,c);
        }

        return ans;
    }

    public int gcd(int a,int b) { 
        while(b!=0){ 
            int temp=a%b; 
            a=b; 
            b=temp; 
        } 
        return a; 
    }
}