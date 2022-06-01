package June;

import java.util.Arrays;
import java.util.List;

class HelpTheOldMan {
    static int a1, a2, z;
    
    static void helper(int n, int a, int b, int c, int x){
        if(n == 0)
            return;
        helper(n-1, a, c, b, x);
        z++;
        if(z == x){
            a1 = a;
            a2 = b;
            return;
        }
        helper(n-1, c, b, a, x);
    }
    static List<Integer> shiftPile(int N, int n){
        // code here
        z = 0;
        helper(N, 1, 3, 2, n);
        return Arrays.asList(a1, a2);
    }    
}
