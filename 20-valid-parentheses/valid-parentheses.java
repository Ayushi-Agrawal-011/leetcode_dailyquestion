class Solution {
     public boolean isValid(String s) {
        if(s.length()%2!=0)
         return false;
      Stack<Character> open=new Stack<>();
		Stack<Character> closed=new Stack<>();
		int c=0,d=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='['|| s.charAt(i)=='{') {
				open.push(s.charAt(i));
				c++;
				
			}
			if(s.charAt(i)==')' || s.charAt(i)==']'|| s.charAt(i)=='}') {
				d++;
				if(open.isEmpty())
					return false;
				char a=open.pop();
				char b=s.charAt(i);
				if(a=='(' && b!=')' )
					return false;
				else if(a=='[' && b!=']' )
					return false;
				if(a=='{' && b!='}' )
					return false;
				
			}
		}
		if(c==0 || d==0 || c!=d)
		       return false;    
		return true;
         }
      
}