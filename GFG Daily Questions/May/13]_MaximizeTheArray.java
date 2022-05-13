import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

class MaximizeTheArray {
    ArrayList<Integer> maximizeArray(int[] arr1, int[] arr2, int n) {
        // code here
        TreeMap<Integer, Integer> tm1 = new TreeMap<>(Collections.reverseOrder());
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(tm1.get(arr2[i]) == null){
                tm1.put(arr2[i], count);
                ++count;
            }
        }
        for(int i = 0; i < n; i++){
            if(tm1.get(arr1[i]) == null){
                tm1.put(arr1[i], count);
                ++count;
            }
        }
        int x = 0;
        for(Integer k : tm1.keySet()){
            if(x == n) break;
            tm2.put(tm1.get(k), k);
            ++x;
        }
        for(Integer l : tm2.keySet()){
            al.add(tm2.get(l));
        }
        return al;
    }
}
