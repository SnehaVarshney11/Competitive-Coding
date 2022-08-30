package August;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class MergingDetails {
    public List<List<String>> mergeDetails(List<List<String>> details) {
        // Your code here
        HashMap<Integer, HashSet<String>> map_1 = new HashMap<>();
        HashMap<String, Integer> map_2 = new HashMap<>();

        for (int i = 0; i < details.size(); i++) {
            List<String> list = details.get(i);

            boolean found = false;
            int target = -1;
            
            for (int j = 1; j < list.size(); j++) {
                if (map_2.getOrDefault(list.get(j), -1) != -1) {
                    target = map_2.get(list.get(j));
                    found = true;
                    break;
                }
            }

            if (found) {
                for (int j = 1; j < list.size(); j++) {
                    HashSet<String> set = map_1.getOrDefault(target, new HashSet<>());
                    set.add(list.get(j));
                    map_2.put(list.get(j), target);
                    map_1.put(target, set);
                }
            } else {
                for (int j = 1; j < list.size(); j++) {
                    map_2.put(list.get(j), i);
                    HashSet<String> set = map_1.getOrDefault(i, new HashSet<>());
                    set.add(list.get(j));
                    map_1.put(i, set);
                }
            }
        }

        List<List<String>> res = new ArrayList<>();
        for (Integer index : map_1.keySet()) {
            List<String> r = new ArrayList<>(map_1.get(index));
            Collections.sort(r);
            r.add(0, details.get(index).get(0));
            res.add(r);
        }

        return res;
    }
}
