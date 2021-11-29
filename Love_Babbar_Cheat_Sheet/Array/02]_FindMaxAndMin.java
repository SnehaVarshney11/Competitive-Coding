package Love_Babbar_Cheat_Sheet.Array;

class FindMaxAndMin {
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int[] ar, int n){
        Pair minmax = new Pair();
        int i;
        // if there is only one element return it is as min and max value 
        if(n == 1){
            minmax.max = ar[0];
            minmax.max = ar[0];
        }
        // if there is only two elements
        if(ar[0] > ar[1]){
            minmax.max = ar[0];
            minmax.min = ar[1];
        } else{
            minmax.max = ar[1];
            minmax.min = ar[0];
        }
        // if there is more than two elements
        for(i = 2; i < n; i++){
            if(ar[i] > minmax.max){
                minmax.max = ar[i];
            } else if(ar[i] < minmax.min){
                minmax.min = ar[i];
            }
        }
        return minmax;
    }
    public static void main(String[] args){
        int[] ar = {1000, 11, 445, 1, 330, 3000};
        int size = 6;
        Pair minmax = getMinMax(ar,size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }    
}
