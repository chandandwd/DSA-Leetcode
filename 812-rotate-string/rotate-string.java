class Solution {
    public boolean rotateString(String s, String goal) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i<s.length(); i++)
            list.add(s.charAt(i)+"");
        
        for(int i = 0; i<s.length(); i++){
            String o = "";
            for(int j = 1; j<list.size(); j++){
                o = o + list.get(j);
            }
            o = o + list.get(0);
            String a = list.remove(0);
            list.add(a);
            if(o.equals(goal))
                return true;
        }
        return false;
        
    }
}