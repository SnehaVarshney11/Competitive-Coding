package November;

import java.util.LinkedList;
import java.util.Queue;

class JumpingNumbers {
    static long jumpingNums(long X) {
        // code here
        Queue<Long> qu = new LinkedList<>();

        long max = 0;

        for(long i = 0; i < 10; i++){

            qu.add(i);

        }

        while(!qu.isEmpty()){

            long num = qu.remove();

            if(num > X){

                continue;

            }

            

            long lastDigit = num % 10;

            if(lastDigit != 0){

                long first = num * 10 + (lastDigit - 1);

                qu.add(first);

            }

            if(lastDigit != 9){

                long sec = num * 10 + (lastDigit + 1);

                qu.add(sec);

            }

            max = Math.max(num, max);

        }

        return max;
    }
}
