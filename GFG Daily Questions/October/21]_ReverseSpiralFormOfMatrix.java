package October;

class ReverseSpiralFormOfMatrix {
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
         int res[]=new int [R*C];

        int kk=R*C-1;

        int top=0,left=0,bottom=R-1,right=C-1;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++)

            res[kk--]=a[top][i];

            top++;

            

             for(int i=top;i<=bottom;i++)

            res[kk--]=a[i][right];

            right--;

            

            if(top<=bottom){

                for(int i=right;i>=left;i--)

                res[kk--]=a[bottom][i];

                bottom--;

            } 

                if(left<=right){

                    for(int i=bottom;i>=top;i--)

                res[kk--]=a[i][left];

                left++;

                }

            }

            return res;
    }
}
