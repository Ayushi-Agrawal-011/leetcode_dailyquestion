class Solution {
    public int calPoints(String[] ops) {
        
    Stack<Integer> st=new Stack<>();
      for(int i=0;i<ops.length;i++){
      
   
            
         
             if(ops[i].equals("C")) 
               st.pop();
              else if(ops[i].equals("D")){
                int x=st.peek();
                st.push(2*x);
              }
          else if(ops[i].equals("+")){
            if(st.size()>=2){
                int x=st.pop();
                int y=st.peek();
                st.push(x);
            st.push(x+y);
            }
          }
    else {
                // Parse the integer and add it to the list
                st.push(Integer.parseInt(ops[i]));
            }
            System.out.println(st);
      }
      int c=0;
      for(int i:st){
     c+=i;
      }
      return c;
    }    
}