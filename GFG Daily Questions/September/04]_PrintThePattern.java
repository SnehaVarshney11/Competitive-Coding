package September;

import java.util.ArrayList;
import java.util.List;

class PrintThePattern {
    static List<String> pattern(int n){
        // code here
        List<String> result = new ArrayList<>();
        int ptr1 = 1;
        int ptr2 = n*n + 1;
        int temp = n;
        String addFront = "--";
        while (temp > 0) {
            String letter = "";
            if (temp != n) {
                letter += addFront;
                addFront += "--";
            }
            for (int i=1; i<=temp; i++, ptr1++) {
                letter += ptr1;
                if (i != temp)
                    letter += "*";
            }
            letter += "*";
            for (int i=1; i<=temp; i++, ptr2++) {
                letter += ptr2;
                if (i != temp)
                    letter += "*";
            }
            ptr2 -= 2*temp-1;
            temp--;
            result.add(letter);
        }
        return result;
    }
}
