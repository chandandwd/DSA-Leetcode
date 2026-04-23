import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> sk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(!sk.isEmpty() && sk.peek() == s.charAt(i) ){
                sk.pop();
            }
            else
            sk.push(s.charAt(i));
        }
        while(!sk.isEmpty()){
            sb.append(sk.pop()+"");
        }
        return sb.reverse().toString();
    }
}