class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        
        for(int i = 0; i<nums.length; i++ ){
            
            int cnt = 0;
            for(int j = 0; j<nums.length; j++ ){
            if(nums[i] == nums[j])
                cnt++;
        }
        if(cnt == 1)
        l.add(nums[i]);
        }
        int[] arr = l.stream().mapToInt(i -> i).toArray();

        return arr;
    }
}