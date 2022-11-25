package Leetcode.NovemberDaily;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class SubarrayMinimums {
    private static final int MOD = 1_000_000_007;
    public int sumSubarrayMins(int[] A) {
        int n = A.length;
        int[] left = new int[n];
        Arrays.fill(left, -1);
        
        int[] right = new int[n];
        Arrays.fill(right, n);
        
        Deque<Integer> stack = new LinkedList<>();
        for (int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && A[i] <= A[stack.peekLast()]) {
                left[stack.pollLast()] = i;
            }
            stack.offerLast(i);
        }
        
        stack.clear();
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && A[i] < A[stack.peekLast()]) {
                right[stack.pollLast()] = i;
            }
            stack.offerLast(i);
        }
        
        long res = 0;
        for (int i = 0; i < n; i++)  {
            long leftRange = (long)i - left[i];
            long rightRange = right[i] - (long)i;
            res = ( res + A[i] * leftRange % MOD * rightRange % MOD ) % MOD;
        }
        return (int)res;
    }
}
