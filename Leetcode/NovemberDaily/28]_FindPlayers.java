package Leetcode.NovemberDaily;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class FindPlayers {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		int n = matches.length;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(matches[i][1])) {
				map.put(matches[i][1], map.get(matches[i][1]) + 1);
			} else {
				map.put(matches[i][1], 1);
			}
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				list1.add(e.getKey());
			}
		}
		TreeSet<Integer> ans = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(matches[i][0])) {
				ans.add(matches[i][0]);
			}
		}
		List<Integer> list2 = new ArrayList<>(ans);
		list.add(list2);
		list.add(list1);

		return list;
    }
}
