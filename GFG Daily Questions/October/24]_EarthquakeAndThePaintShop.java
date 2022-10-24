package October;

import java.util.Map;
import java.util.TreeMap;

class alphanumeric {
    public String name;
    public int count;
    alphanumeric(String name, int count) {
        this.name = name;
        this.count = count;
    }
};
class EarthquakeAndThePaintShop {
    alphanumeric[] sortedStrings(int n, String a[]) {

        Map<String,Integer> map = new TreeMap<>();

        for(String str:a)

        map.put(str,map.getOrDefault(str,0)+1);

        alphanumeric alp[]=new alphanumeric[map.size()];

        int i=0;

        for(String ele:map.keySet()){

            alp[i++]=new alphanumeric(ele,map.get(ele));

        }

        return alp;

    }
}
