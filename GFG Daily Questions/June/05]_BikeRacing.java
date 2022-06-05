package June;

class BikeRacing{
    static long buzzTime(int N, long M, long L, long H[], long A[]){
        // code here
        long low = 0;
       long high = Math.max(L,M);
       long mid = 0, ans = 0;
       
       while(low<=high)
       {
           mid = (low + high) >> 1;
           
           long fast = 0;
           for(int i=0;i<N;i++)
           {
               if(H[i] + A[i]*mid >= L)
               {
                   fast = fast + H[i] + A[i]*mid;
               }
           }
           
           if(fast>=M)
           {
               ans = mid;
               high = mid - 1;
           }
           else
           {
               low = mid + 1;
           }
           
       }
       
       return ans;
    }
}
