package Leetcode.DecDaily;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class SortCharacters {
    public String frequencySort(String s) {
        if (s.length() < 3) return s;

        StringBuilder sb = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) map.merge(c, 1, Integer::sum);

        map.entrySet().stream()

                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))

                .forEach(entry -> sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue())));

        return sb.toString();
    }
}
