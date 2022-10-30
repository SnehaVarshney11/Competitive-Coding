package October;

class ChicksInZoo {
    public long NoOfChicks(int N)
    {
        // Code here
        if(N<=1) return 1;

        if(N <= 6){

            return 3 * NoOfChicks(N -1);

        }

        else if ( N == 7){

            return( 3 * NoOfChicks(N-1) - 3 * NoOfChicks(N-6));

        }

        else{

            return (3 * NoOfChicks(N-1) - 2 * NoOfChicks(N-6));
        }
    }
}
