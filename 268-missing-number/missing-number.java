class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int m = (n*(n+1))/2;
        Arrays.sort(nums);
        if(nums[0] != 0) return 0;
        for(int x : nums){
            sum += x;
        }
        return (m-sum);

       
    }
}