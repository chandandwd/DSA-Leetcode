import java.util.*;
class Solution {
    public boolean isSafe(int n, int[][] graph, int[] state){
        if(state[n]!=0){
            return state[n] == 2;
        }
        state[n] = 1;
        for(int nbr: graph[n]){
            if(!isSafe(nbr,graph,state)) return false;
        }
        state[n] = 2;
        return true;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
       int n = graph.length;
       int[] state = new int[n];
       List<Integer> safe = new ArrayList<>();
       for(int i = 0; i<n; i++){
        if(isSafe(i,graph,state)){
            safe.add(i);
        }
       }
       return safe; 
    }
}