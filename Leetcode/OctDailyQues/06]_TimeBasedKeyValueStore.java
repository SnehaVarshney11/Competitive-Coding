package Leetcode.OctDailyQues;

import java.util.HashMap;
import java.util.TreeMap;

class TimeMap {
    HashMap<String, TreeMap<Integer, String>> hm;
    public TimeMap() {
        hm =new HashMap<>();   
    }
    
    public void set(String key, String value, int timestamp) {
        hm.computeIfAbsent(key,k->new TreeMap<>()).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key)) return "";
        TreeMap<Integer, String> tree=hm.get(key);
        Integer time=tree.floorKey(timestamp);
        return time!=null?tree.get(time):"";
    }
}
