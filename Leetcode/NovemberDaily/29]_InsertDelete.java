package Leetcode.NovemberDaily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class InsertDelete {
    List<Integer> nums;
    Map<Integer, Integer> idxMap;
    Random random;

    public void RandomizedSet() {
        nums = new ArrayList<>();
        idxMap = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (idxMap.containsKey(val)) {
            return false;
        }

        idxMap.put(val, nums.size());
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!idxMap.containsKey(val)) {
            return false;
        }

        int idx = idxMap.get(val);
        int lastIdx = nums.size() - 1;
        if (idx != lastIdx) {
            int lastVal = nums.get(lastIdx);
            nums.set(idx, lastVal);
            idxMap.put(lastVal, idx);
        }
        nums.remove(lastIdx);
        idxMap.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}
