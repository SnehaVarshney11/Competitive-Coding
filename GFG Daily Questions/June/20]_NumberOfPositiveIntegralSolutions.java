package June;

class NumberOfPositiveIntegralSolutions {
    long posIntSol(String s)
    {
        //code here.
        String[] s1 = s.split("=");
        String[] s2 = s1[0].split("\\+");
        int k = Integer.parseInt(s1[1]);
        int n = s2.length;
        
        if(n > k) return 0;
        
        k--; n--;
        long num = 1l;
        for(int i = k; i >= (k-n+1); i--){
            num *= (long)i;
        }
        long d = 1l;
        for(int i = n; i >= 1; i--){
            d *= (long)i;
        }
        return (long)num/d;
    }
}
