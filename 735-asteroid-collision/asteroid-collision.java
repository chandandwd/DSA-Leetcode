import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();

        for (int x : a) {
            boolean destroyed = false;

            while (!s.isEmpty() && s.peek() > 0 && x < 0) {
                if (Math.abs(s.peek()) < Math.abs(x)) {
                    s.pop(); // stack asteroid destroyed
                } 
                else if (Math.abs(s.peek()) == Math.abs(x)) {
                    s.pop();
                    destroyed = true;
                    break;
                } 
                else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                s.push(x);
            }
        }

        int[] res = new int[s.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = s.pop();
        }

        return res;
    }
}