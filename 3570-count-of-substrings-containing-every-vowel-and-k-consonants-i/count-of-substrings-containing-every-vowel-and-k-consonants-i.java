class Solution {
    public int countOfSubstrings(String s, int k) {
      if(s.length()<5)
      return 0;  
      int ans=0;
      	for(int i=0;i<s.length();i++) {
         
             int a=0,e=0,I=0,o=0,u=0,c=0;
			for(int j=i;j<s.length();j++) {
               if(s.charAt(j)=='a'){
                    a++;
                }
                else if(s.charAt(j)=='e'){
                    e++;
                }
                else if(s.charAt(j)=='i'){
                    I++;
                }
                else if(s.charAt(j)=='o'){
                    o++;
                }
                else if(s.charAt(j)=='u'){
                    u++;
                }
                else{
                    c++;
                }
                if(c==k && a>0 && e>0 && I>0 && o>0 && u>0){
                ans++;
                }

			}
         
		}
           return ans;
    }
}