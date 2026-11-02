class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> op = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        return solve(candidates,0,l,op,0,target);
    }
    List<List<Integer>> solve(int[] arr, int idx, List<Integer> l,List<List<Integer>> op, int sum, int target){
        
        if(target == sum ){ op.add(new ArrayList<>(l));
        return op;}

        if(idx == arr.length || sum > target) return op;
        
        l.add(arr[idx]);
        solve(arr,idx, l, op,sum+arr[idx], target);
        l.remove(l.size()-1);
        solve(arr, idx+1, l ,op, sum, target);

        return op;

    }
} 