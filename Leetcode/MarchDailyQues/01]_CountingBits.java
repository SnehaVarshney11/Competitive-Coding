package MarchDailyQues;

class CountingBits{
    public int[] countBits(int n) {
        int[] ar = new int[n + 1];
        ar[0] = 0;
        for(int i = 1; i <= n; ++i){
            ar[i] = ar[i/2] + i%2;
            //i % 2 = 0 for odd and 1 for even
        }
        return ar;
    }
}