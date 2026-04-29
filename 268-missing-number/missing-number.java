class Solution {
    public int missingNumber(int[] nums) {
    int a = nums.length;
    int s = (a*(a+1))/2;
    for(int i:nums){
       s = s-i;
    }
    return s;
    }
}