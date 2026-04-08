class Solution {
    public int minAddToMakeValid(String s) {
        while(s.contains("()"))
        s= s.replace("()","");
    return s.length();
    }

}