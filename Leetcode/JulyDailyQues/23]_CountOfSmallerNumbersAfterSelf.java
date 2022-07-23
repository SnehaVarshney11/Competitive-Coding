package Leetcode.JulyDailyQues;

import java.util.ArrayList;
import java.util.List;

class CountOfSmallerNumbersAfterSelf {
    static class segmentTreeNode {
        int start, end, count;
        segmentTreeNode left, right;
        segmentTreeNode(int start, int end, int count) {
            this.start = start;
            this.end = end;
            this.count = count;
            left = null;
            right = null;
        }
    }
    public static List<Integer> countSmaller(int[] nums) {
        // write your code here
        List<Integer> result = new ArrayList<Integer>();
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i : nums) {
            min = Math.min(min, i);
            
        }
        if (min < 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] -= min;//deal with negative numbers, seems a dummy way
            }
        }
        for (int i : nums) {
            max = Math.max(max, i);
        }
        segmentTreeNode root = build(0, max);
        for (int i = 0; i < nums.length; i++) {
            updateAdd(root, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            updateDel(root, nums[i]);
            result.add(query(root, 0, nums[i] - 1));
        }
        return result;
    }
    public static segmentTreeNode build(int start, int end) {
        if (start > end) return null;
        if (start == end) return new segmentTreeNode(start, end, 0);
        int mid = (start + end) / 2;
        segmentTreeNode root = new segmentTreeNode(start, end, 0);
        root.left = build(start, mid);
        root.right = build(mid + 1, end);
        root.count = root.left.count + root.right.count;
        return root;
    }

    public static int query(segmentTreeNode root, int start, int end) {
        if (root == null) return 0;
        if (root.start == start && root.end == end) return root.count;
        int mid = (root.start + root.end) / 2;
        if (end < mid) {
            return query(root.left, start, end);
        } else if (start > end) {
            return query(root.right, start, end);
        } else {
            return query(root.left, start, mid) + query(root.right, mid + 1, end);
        }
    }

    public static void updateAdd(segmentTreeNode root, int val) {
        if (root == null || root.start > val || root.end < val) return;
        if (root.start == val && root.end == val) {
            root.count ++;
            return;
        }
        int mid = (root.start + root.end) / 2;
        if (val <= mid) {
            updateAdd(root.left, val);
        } else {
            updateAdd(root.right, val);
        }
        root.count = root.left.count + root.right.count;
    }

    public static void updateDel(segmentTreeNode root, int val) {
        if (root == null || root.start > val || root.end < val) return;
        if (root.start == val && root.end == val) {
            root.count --;
            return;
        }
        int mid = (root.start + root.end) / 2;
        if (val <= mid) {
            updateDel(root.left, val);
        } else {
            updateDel(root.right, val);
        }
        root.count = root.left.count + root.right.count;
    }
}
