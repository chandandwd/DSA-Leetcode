class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder op = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            sb = sb.reverse();
            op.append(sb + " ");
        }
        return op.toString().trim();
    }
}