package September;

import java.util.Arrays;

class MinimumCostToCutABoardIntoSquares {
    public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        // code here
        Arrays.sort(X);
        Arrays.sort(Y);
        int h=1;
        int v=1;
        int x=X.length-1;//ver
        int y=Y.length-1;//hori
        int cost=0;
        while(x>=0 && y>=0){
            if(X[x]<=Y[y]){//greatest horizontal cost is taken
               cost=cost+Y[y]*h;
               v++;
               y--;
            }else{//if vertical cut has greatercost
                cost=cost+X[x]*v;
                h++;
                x--;
            }
        }
        while(x>=0){//if elemnts remaining in X array
            cost=cost+X[x]*v;
                h++;
                x--;
        }
        while(y>=0){//if elemnts remaining in Y array
            cost=cost+Y[y]*h;
               v++;
               y--;
        }
        return cost;
   }
}
