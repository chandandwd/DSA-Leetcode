class Solution {
    public boolean backspaceCompare(String s, String t) {
        int cnt =0;
        Stack<Character> s2 = new Stack<>();
        Stack<Character> s1 = new Stack<>();
        for(int i =0; i<s.length(); i++){
            if(!s2.isEmpty() && s.charAt(i) == '#'){
                s2.pop();
            }
            else if(s2.isEmpty() && s.charAt(i) == '#'){
                continue;
            }

            else s2.push(s.charAt(i));
        }
        for(int i =0; i<t.length(); i++){
            if(!s1.isEmpty() && t.charAt(i) == '#'){
                s1.pop();
            }
            else if(s1.isEmpty() && t.charAt(i) == '#'){
                continue;
            }
            else s1.push(t.charAt(i));
        }
        if(s2.size() == s1.size()){
        for(int i = s1.size()-1; i>=0; i--){
        if(s2.get(i) == s1.get(i)){
            cnt ++;
        }
    }}
    return (cnt == s2.size() && cnt == s1.size());}
}