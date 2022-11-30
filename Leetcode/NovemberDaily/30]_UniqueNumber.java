package Leetcode.NovemberDaily;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class UniqueNumber {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.merge(i, 1, Integer::sum);
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}
