package June;

import java.util.ArrayList;

class TrickySubsetProblem{
    static int isPossible(long S, int N, long X, long A[])
    {
        // code here
        ArrayList<Long> al = new ArrayList<>();
        al.add(S);
        Long cur = S;
        for(int i = 0; i < N; i++){
            Long t = cur + A[i];
            al.add(t);
            if(t >= X){
                break;
            }
            cur += t;
        }
        int i = al.size() - 1;
        while(i >= 0 && X > 0){
            if(X >= al.get(i)){
                X -= al.get(i);
            }
            i--;
        }
        if(X == 0) return 1;
        else return 0;
    }
}