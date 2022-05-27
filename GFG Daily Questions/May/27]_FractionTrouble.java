package May;

class FractionTrouble {
    public int[] numAndDen(int n, int d)
    {
        // code here
        int[] ar = new int[2];
        long max = Integer.MIN_VALUE;
        for(int i = 10000; i >= 2; i--){
            int a = ((i*n)-1)/d;
            long b = ((long)a * (long)10000000) / (long)i;
            if(max < b && a <= i){
                max = b;
                ar[0] = a;
                ar[1] = i;
            }
        }
        return ar;
    }
}
