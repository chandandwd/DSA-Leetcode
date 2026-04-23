class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int result = -1;
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    found = true; // start checking after this
                } 
                else if (found && nums2[j] > nums1[i]) {
                    result = nums2[j];
                    break;
                }
            }
            nums1[i] = result;
        }
        return nums1;
    }
}