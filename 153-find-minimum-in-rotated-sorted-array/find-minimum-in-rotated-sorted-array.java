import java.util.*;
class Solution {
    public int findMin(int[] arr) {
        int h = arr.length-1, l = 0; 
        int ans = Integer.MAX_VALUE;

        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]<=arr[h]){
                ans = Math.min(ans,arr[mid]);
                h = mid-1;
            }
            else if(arr[mid]>=arr[l]){
                ans = Math.min(ans, arr[l]);
                l = mid+1;
            }
        }
    return ans;
    }
}