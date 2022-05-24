import java.util.Arrays;

class ArrayPartition{
    boolean partitionArray(int N, int K, int M, int [] A){
        // code here
        Arrays.sort(A);
        return partition(0, K, M, A);
    }
    boolean partition(int start, int K, int M, int[] A){
        int n = A.length;
        if(start >= n){
            return true;
        }
        for(int i = start+K-1; i < n; i++){
            if((A[i] - A[start]) > M)
                return false;
            if(partition(i+1, K, M, A))
                return true;
        }
        return false;
    }
}