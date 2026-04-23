class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        int j = 0;
     for(int i = 1; i<nums.length; i++){
        if(nums[j] < nums[i]){
            sum += nums[i];
        }
        else{
            sum = nums[i];
            max = Math.max(max,sum);
        }
        max = Math.max(max,sum);
        j++;
     }
     return max;  
    }
}