class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray();
        Arrays.sort(c1);
        s = new String(c1);
        char[] c2 = t.toCharArray();
        Arrays.sort(c2);
        t = new String(c2);

        return s.equals(t);
    }
}