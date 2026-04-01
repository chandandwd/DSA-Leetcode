class Solution {
    public boolean canConstruct(String rN, String m) {
        boolean r = true;
        for(int i = 0; i<rN.length(); i++){
            String cc = rN.substring(i,i+1);
            if(m.contains(cc)){
                m = m.replaceFirst(cc,"");
                r = true;
                }
            else{
                r = false;
                break;
            }
        }
        return r;
    }
}