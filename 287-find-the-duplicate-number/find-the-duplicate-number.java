class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int d = 0;
        int i = 0, j = 1;
        while(j<nums.length){
            if(nums[i] == nums[j]){ d = nums[i]; break;}
            i++; j++;
        }
        return d;
    }
}