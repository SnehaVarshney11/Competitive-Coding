import java.util.HashSet;

class IntersectionOfTwoArrays{
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            hs1.add(a[i]);
        }
        int count = 0;
        for(int i = 0; i < m; i++){
            if(hs1.contains(b[i]) && !hs2.contains(b[i])){
                count++;
                hs2.add(b[i]);
            }
        }
        return count;
    }
}