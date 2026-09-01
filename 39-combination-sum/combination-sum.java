import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(candidates, target, new ArrayList<>(), 0, ans);
        return ans;
    }

    public void combination(int[] candidates, int target, List<Integer> list, int idx, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                list.add(candidates[i]);
                combination(candidates, target - candidates[i], list, i, ans);
                list.remove(list.size() - 1);
            }
        }
    }
}