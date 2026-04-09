import java.util.*;

class Solution {

    double median(int[] arr){
        int n = arr.length;
        if(n % 2 != 0){
            return (double) arr[n/2];
        } else {
            return ((double) arr[n/2] + (double) arr[n/2 - 1]) / 2.0;
        }
    }

    public double[] medianSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        double[] op = new double[n + 1 - k];

        int[] window = new int[k];

        for(int i = 0; i < k; i++){
            window[i] = nums[i];
        }
        Arrays.sort(window);

        op[0] = median(window);

        int b = 1;

        for(int i = k; i < n; i++){

            int out = nums[i - k];
            int in = nums[i];

            int idx = Arrays.binarySearch(window, out);

            while(idx < k - 1){
                window[idx] = window[idx + 1];
                idx++;
            }

            int insertPos = Arrays.binarySearch(window, 0, k - 1, in);
            if(insertPos < 0) insertPos = -insertPos - 1;

            for(int j = k - 1; j > insertPos; j--){
                window[j] = window[j - 1];
            }

            window[insertPos] = in;

            op[b++] = median(window);
        }

        return op;
    }
}