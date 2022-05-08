import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class NthitemthroughSum {
    static int nthItem(int L1, int L2, int A[], int B[], int N)
    {
        // code here
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < L1; i++) {
            for (int j = 0; j < L2; j++) {
                hashSet.add(A[i] + B[j]);
            }
        }
    
        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
    
        Collections.sort(arrayList);
    
        if (N > arrayList.size()) {
            return -1;
        }
    
        return arrayList.get(N - 1);
    }
}
