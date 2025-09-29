class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int minc=0,minr=0,maxc=arr[0].length-1,maxr=arr.length-1;
    	int c=0,te=arr.length*arr[0].length;
        List<Integer> t = new ArrayList<>();
        
    	while(c<te)
    	{for(int i=minc;i<=maxc && c<te;i++) {
            t.add(arr[minr][i]);
    		System.out.print(arr[minr][i]+" ");
    		c++;
    	}
    	
    	minr++;
    	for(int i=minr;i<=maxr && c<te;i++) {
            t.add(arr[i][maxc]);
    		System.out.print(arr[i][maxc]+" ");
    		c++;
    	}
    	maxc--;
    	
    	for(int i=maxc;i>=minc && c<te;i--) {
            t.add(arr[maxr][i]);
    		System.out.print(arr[maxr][i]+" ");
    		c++;
    	}
    	maxr--;
   
    	for(int i=maxr;i>=minr && c<te;i--) {
            t.add(arr[i][minc]);
    		System.out.print(arr[i][minc]+" ");
    		c++;
    	}
    	minc++;
    	
    }
    return t;
    }
}