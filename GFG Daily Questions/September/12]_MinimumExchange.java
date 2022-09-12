package September;

class MinimumExchange {
    public int ME(char[][] matrix)
    {
        // Code here
        int a=0;
        int b=0;

        for(int i = 0; i<matrix.length; i++ ) {
            for (int j = 0; j<matrix[0].length; j++ ) {

                if(matrix[i][j]=='A') {

                    if((i+j)%2==1 ) {

                        a++;

                    } else {

                        b++;

                    }

                } else {

                    if((i+j)%2 == 1 ) {

                        b++;

                    }else {

                        a++;

                    }

                }

            }

        }

        if((matrix.length*matrix[0].length)%2==1 ){

             return a/2;

           }

        return Math.min(a, b)/2;
    }
}
