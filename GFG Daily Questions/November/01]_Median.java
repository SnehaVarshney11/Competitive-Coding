package November;

import java.util.Arrays;

class Median {
    int median(int matrix[][], int R, int C) {
        // code here     
        int ind=0;

        int[] arr=new int[R*C];

        for(int i=0;i<R;i++) {

            for(int j=0;j<C;j++) {

                arr[ind++]=matrix[i][j];

            }

        }

        Arrays.sort(arr);

        int median;

        if(arr.length%2!=0)

        median=arr.length/2;

        else

        median=(arr.length+1)/2;

        

        return arr[median];
    }
}
