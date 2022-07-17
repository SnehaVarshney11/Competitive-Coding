package Leetcode.JulyDailyQues;

import java.util.LinkedList;

class JumpGameVI {
    public int maxResult(int[] nums, int k) {
        int[] ar = new int[nums.length];
        LinkedList<Integer> ll = new LinkedList<>();

        ar[0] = nums[0];
        ll.offer(0);

        // function
        for (int i = 1 ; i < nums.length ; i++) {
            if (ll.getFirst() < i - k) {
                ll.removeFirst();
            }
            ar[i] = ar[ll.getFirst()] + nums[i];

            while (!ll.isEmpty() && ar[ll.getLast()] <= ar[i]) {
                ll.removeLast();
            }
            ll.addLast(i);
        }

        // answer
        return ar[nums.length - 1];
    }
}
