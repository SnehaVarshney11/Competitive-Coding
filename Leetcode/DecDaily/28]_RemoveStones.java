package Leetcode.DecDaily;

import java.util.PriorityQueue;
import java.util.Queue;

class RemoveStones {
    public int minStoneSum(int[] piles, int k) {
        Queue<Integer> p = new PriorityQueue<>((a, b) -> b-a);

        int s = 0; // total sum

        int d = 0; // delta removed

        for (int x : piles) {

            s += x;

            p.offer(x);

        }

        while (k >0) {

            int c = p.poll();

            int x = c/2;

            d += x;

            p.offer(c-x);

            k--;

        }

        return s - d;
    }
}
