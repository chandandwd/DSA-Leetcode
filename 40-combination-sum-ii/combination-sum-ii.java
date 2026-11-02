class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> op = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,candidates,l,op,target);
        return op;
    }

    void solve(int idx, int [] arr, List<Integer> l, List<List<Integer>> res, int target){
        if(target == 0){
            // Collections.sort(l);
            res.add(new ArrayList<>(l));
            return ;
        }
        // if(target<0 || idx == arr.length){
        //     return;
        // }

        for (int i = idx; i < arr.length; i++) {
            // Skip duplicates at the same tree level
            if (i > idx && arr[i] == arr[i - 1]) continue;
            
            // If the current element exceeds the remaining target, further elements will too
            if (arr[i] > target) break;

            l.add(arr[i]);
            // Move to i + 1 because each number can only be used once
            solve(i + 1, arr, l, res, target - arr[i]);
            l.remove(l.size() - 1); // Backtrack
        }

    }
    
} 