class Solution {
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(n%2==1)
        return false;

Stack<Integer> open=new Stack<>();
Stack<Integer> unlocked=new Stack<>();
for(int i=0;i<s.length();i++){
    char a=s.charAt(i);
  char b=locked.charAt(i);
    if(b=='0')
    unlocked.push(i);
    else if(a=='(')
    open.push(i);
    else if(a==')'){

        if(!open.isEmpty())
        open.pop();
       else if(!unlocked.isEmpty())
        unlocked.pop();
        else
        return false;

    }
}
while(!open.isEmpty() && !unlocked.isEmpty() && open.peek()<unlocked.peek()){
    open.pop();
    unlocked.pop();
}


        return open.isEmpty();
    }
}