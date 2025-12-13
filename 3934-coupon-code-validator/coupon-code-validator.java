import java.util.*;
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
      List<String>ll=new ArrayList<>();
      int n=code.length;
      for(int i=0;i<n;i++){
     String a=code[i];
     String b=businessLine[i];
     boolean c=isActive[i];
     if(c!=false){
        if(b.equals("electronics")||b.equals("grocery")||b.equals("restaurant")||b.equals("pharmacy")){
            int d=0;
            for(int j=0;j<a.length();j++){
                char ch=a.charAt(j);
                if(!((ch>=97 && ch<=122)||(ch>=65 && ch<=90)||(ch>=48 && ch<=57) || (ch==95))){
                    d=1;
                    break;
            }
        }
        if(d==0 && a.length()!=0)
        ll.add(b+"#"+a);
     }

      }  }
       Collections.sort(ll, (s1, s2) -> {

            String[] p1 = s1.split("#");
            String[] p2 = s2.split("#");

            String b1 = p1[0], c1 = p1[1];
            String b2 = p2[0], c2 = p2[1];

            int o1 = order(b1);
            int o2 = order(b2);

            if (o1 != o2)
                return o1 - o2;

            return c1.compareTo(c2);
        });

           List<String> ans = new ArrayList<>();
        for (String s : ll) {
            ans.add(s.split("#")[1]);
        }
      return ans;
    }
     int order(String b) {
        if (b.equals("electronics")) return 0;
        if (b.equals("grocery")) return 1;
        if (b.equals("pharmacy")) return 2;
        return 3; // restaurant
    }
}