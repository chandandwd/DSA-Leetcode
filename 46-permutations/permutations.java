import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, new boolean[nums.length]);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> current, int[] nums, boolean[] visited) {
        // Base case: if the current permutation is full length, add it to the answer
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            // Choose
            visited[i] = true;
            current.add(nums[i]);

            // Explore
            backtrack(ans, current, nums, visited);

            // Un-choose (Backtrack)
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }
}