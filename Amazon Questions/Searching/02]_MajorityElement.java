import java.util.HashMap;
import java.util.Map;

class MajorityElement {
    static int majorityElement(int a[], int size)
    {
        // your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: a) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
            if (map.containsKey(num) && map.get(num) > a.length/2)
                return num;
        }
        return -1;
    }
}
