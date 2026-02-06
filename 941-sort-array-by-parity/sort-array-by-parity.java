class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[]num = new int[nums.length];
        int k =0;
        for(int x : nums){
            if(x%2 == 0)
            num[k++] = x;
        }
        for(int x : nums){
            if(x%2 != 0)
            num[k++] = x;
        }
        return num;
    }
}