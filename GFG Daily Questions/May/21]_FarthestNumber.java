import java.util.Arrays;

class FarthestNumber{
    static int[] farNumber(int N, int Arr[])
	{    
	    int[] ar = new int[N];
	    Arrays.fill(ar, -1);
	    for(int i = 0; i < N; i++){
	        for(int j = N-1; j >= i+1; j--){
	            if(Arr[i] > Arr[j]){
	                ar[i] = j;
	                break;
	            }
	        }
	    }
	    return ar;
    }
} 