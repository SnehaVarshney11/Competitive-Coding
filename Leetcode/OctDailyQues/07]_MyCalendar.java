package Leetcode.OctDailyQues;

import java.util.TreeMap;

class MyCalendar {
    private TreeMap<Integer, Integer> map;
    public MyCalendar() {
        map = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);
        int res = 0;   // track max the number of in progress events
        int sum = 0;  // track the number of in progress events
        for (int val : map.values()) {
            sum += val;
            res = Math.max(res, sum);
        }
        return res;
    }
}
