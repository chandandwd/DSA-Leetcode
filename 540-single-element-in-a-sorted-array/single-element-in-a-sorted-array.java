class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l = 0, h = arr.length - 1, mid;

        while (l <= h) {
            mid = l + (h - l) / 2;

            if (l == h)
                return arr[mid];
            if (mid + 1 <= h && arr[mid] == arr[mid + 1]) {
                if ((h - mid - 1) % 2 == 1)
                    l = mid + 2;
                else
                    h = mid - 1;
            }
            else if (mid - 1 >= l && arr[mid] == arr[mid - 1]) {
                if ((h - mid) % 2 == 1)
                    l = mid + 1;
                else
                    h = mid - 2;
            }
            else {
                return arr[mid];
            }
        }

        return -1;
    }
}