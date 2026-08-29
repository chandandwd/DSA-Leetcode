class Solution {
    public boolean search(int[] arr, int target) {
        int l = 0, h = arr.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;

            if(arr[mid] == target) return true;

            if(arr[mid] == arr[l] && arr[mid] == arr[h]) {
                l++;
                h--;
                continue;
            }

            if(arr[l] <= arr[mid]){
                if(arr[l] <= target && arr[mid]>=target) h = mid-1;
                else l= mid+1;
            }
            

            else{
                if(arr[mid]<= target && arr[h]>=target) l=mid+1;
                else h = mid -1;
            } 
        }
        return false;   
    }
}