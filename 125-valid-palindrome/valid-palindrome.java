import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if("abcdefghijklmnopqrstuvwxyz0123456789".contains(s.charAt(i) + ""))
                sb.append(s.charAt(i));
        }

        return pal(0, sb);
    }

    public boolean pal(int i, StringBuilder sb){
        if(i >= sb.length() / 2)
            return true;

        if(sb.charAt(i) != sb.charAt(sb.length() - i - 1))
            return false;

        return pal(i + 1, sb);
    }
}