class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        int max = 0;
        ArrayList<Boolean> b = new ArrayList<>();
        for(int i : c)
          max = Math.max(max,i);
        for(int i : c){
            if((i+e) >= max) b.add(true);
            else b.add(false);
        }
        return b;
    }
}