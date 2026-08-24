class Solution {
    private int first(int[] arr, int x){
        int first  = -1;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low +(high -low)/2;
            if(arr[mid] == x){
                first = mid; high = mid -1;
            }
            else if (arr[mid]<x) low = mid+1;
            else high = mid-1;
        }
        return first;
    }

    private int last(int[] arr, int x){
        int last  = -1;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low +(high -low)/2;
            if(arr[mid] == x){
                last = mid; low = mid+1;
            }
            else if (arr[mid]<x) low = mid+1;
            else high = mid-1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = first(nums,target);
        ans[1] = last(nums,target);
        return ans;
    }

}