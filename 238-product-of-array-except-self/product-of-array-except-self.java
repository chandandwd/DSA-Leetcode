class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1, cnt = 0; 
        for(int x : nums){
            if(x!=0)
            mul = mul*x;
            else cnt++;
        }
        for(int i = 0; i<nums.length; i++){
            if(cnt == 0)
            nums[i] = mul/nums[i];
            else if(cnt == 1  && nums[i] == 0)        
            nums[i] = mul;
            else if(cnt == 1 && nums[i] != 0) nums[i]=0;
            else nums[i] =0;
            }
        return nums;
    }
}