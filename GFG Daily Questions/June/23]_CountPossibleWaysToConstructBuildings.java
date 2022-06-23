package June;

class CountPossibleWaysToConstructBuildings {
    public int TotalWays(int N)
   {
       long a = 1;
       long b = 1;
       long c = 0;
       
       for(int i = 0; i < N; i++){
           c = (a + b)%1000000007;
           a = b%1000000007;
           b = c%1000000007;
       }
       c = c*c;
       c = c % 1000000007;
       int z=(int)c;  
       return z;
   }
}
