class Solution {
    public int findPeakElement(int[] nums) {
        int peak = -2147483648;
        int pI = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]>=peak){
                peak = nums[i];
                pI = i;
            }
        }
        return pI;
        
    }
}