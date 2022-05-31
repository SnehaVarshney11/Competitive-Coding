package May;

import java.util.ArrayList;
import java.util.HashSet;

class nCrModM {
    ArrayList<Integer> findPrimeFactors(int n){
        HashSet<Integer> factors=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int c=2;
        while(n>1){
            if(n%c==0){
                factors.add(c);
                n/=c;
            }
            else
                c++;
        }
        for(int i:factors){
            ans.add(i);
        }
        return ans;
    }
     int findByCrt(ArrayList<Integer> x,ArrayList<Integer> r){
        int N=x.size();
        int min_x=0;
        while(true){
            boolean found=true;
            for(int i=0;i<N;i++){
                if(min_x%x.get(i)!=r.get(i)){
                    found=false;
                    break;
                }
            }
            if(found){
                return min_x;
            }
            min_x++;
        }
    }
    int rCnModP(int n, int r, int p){
        if(r==0||r==n){
            return 1;
        }
        int nCr[] = new int[r+1];
        
        nCr[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=Math.min(i,r);j>0;j--){
                nCr[j]=(nCr[j]+nCr[j-1])%p;
            }
        }
        return nCr[r];
    }
    int rCnModPrimeLucas(int n, int r, int p){
        if(r==0) {
            return 1;
        }
        return (rCnModPrimeLucas(n/p, r/p, p)*rCnModP(n%p, r%p, p))%p;
    }
    int nCrModM(int n, int r, int m){
        ArrayList<Integer> primes=new ArrayList<>();
        primes=findPrimeFactors(m);
         ArrayList<Integer> rem=new ArrayList<>();
        for(int p:primes){
            rem.add(rCnModPrimeLucas(n, r, p));
        }
        return findByCrt(primes, rem);
     }
}
