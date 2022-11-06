package November;

import java.util.ArrayList;
import java.util.List;

class MinimumNumberOfCoins {
    static List<Integer> minPartition(int N)
    {
        // code here
        List<Integer> list=new ArrayList<Integer>();

        int arr[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };

        int ln =arr.length-1;

        for(int i=ln; i>=0; i--){

            while(N>=arr[i]&& N>0){

                N=N-arr[i];

                list.add(arr[i]);

            }

            if(N==0){

                break;

            }

        }

        return list;
    }
}
