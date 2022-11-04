package November;

class BaseEquivalence {
    String baseEquiv(int n, int m)
    {
        // code here
         for(int i=2; i<=32; i++){

            int N = (int)(Math.log10(n) / Math.log10(i)) + 1;

            if(N== m) return "Yes";

        }

        return "No";
    }
}
