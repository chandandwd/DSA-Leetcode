import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int r = 0;
        int p = 0;
        int sum = 0;
        for(String x : operations){
            if(x.equals("+")){
                r = s.pop();
                p= s.peek()+r;
                s.push(r);
                s.push(p);
                }
            else if(x.equals("C"))
                s.pop();
            else if(x.equals("D")){
                s.push(s.peek()*2);
                 }
            else{
                int num = Integer.parseInt(x);
                s.push(num);}
        }
        for(int t : s){
            sum = sum + t;
        }
        return sum;
    }
}