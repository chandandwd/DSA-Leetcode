import java.util.*;
class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder sb = new StringBuilder();
        int m = 0, n = 0;
        while(m < w1.length()  || n < w2.length()){
            if(m <w1.length()){ sb.append(w1.charAt(m)+""); m++;}
            if(n < w2.length()){ sb.append(w2.charAt(n)+""); n++;}
        }   
    return sb.toString();
    }
}