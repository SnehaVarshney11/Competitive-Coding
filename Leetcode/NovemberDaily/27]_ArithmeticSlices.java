package Leetcode.NovemberDaily;

import java.util.HashMap;
import java.util.TreeSet;

class ArithmeticSlices {
    HashMap<String, Long> cache;
    HashMap<Long, TreeSet<Integer>> indexMap = new HashMap<>();

    public int numberOfArithmeticSlices(int[] nums) {
        Long sum = 0L;
        cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long number = (long) nums[i];
            TreeSet<Integer> sawAt = new TreeSet<>();
            if (indexMap.containsKey(number)) {
                sawAt = indexMap.get(number);
            }
            sawAt.add(i);
            indexMap.put(number, sawAt);
        }


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Long diff = (long) nums[j] - nums[i];
                Long target = nums[j] + diff;
                if (!indexMap.containsKey(target)) continue;
                Integer nextIndex = indexMap.get(target).ceiling(j + 1);
                if (nextIndex == null) continue;
                sum += slices(nums, nextIndex, diff, target);
            }

        }
        return sum.intValue();
    }

    public Long slices(int[] nums, int i, Long diff, Long target) {
        Long total = 0L;
        if (i == nums.length) return 0L;
        String cacheKey = i + "," + diff + "," + target;
        if (cache.containsKey(cacheKey)) {
            return cache.get(cacheKey);
        }

        if (nums[i] == target) {
            total++;
            long newTarget = (long) nums[i] + diff;
            if (indexMap.containsKey(newTarget)) {
                Integer nextIndex = indexMap.get(newTarget).ceiling(i + 1);
                if (nextIndex != null) {
                    total += slices(nums, nextIndex, diff, newTarget);
                }
            }
        }

        long newTarget = target;
        if (indexMap.containsKey(newTarget)) {
            Integer nextIndex = indexMap.get(newTarget).ceiling(i + 1);
            if (nextIndex != null) {
                total += slices(nums, nextIndex, diff, newTarget);
            }
        }
        cache.put(cacheKey, total);
        return total;
    }
}
