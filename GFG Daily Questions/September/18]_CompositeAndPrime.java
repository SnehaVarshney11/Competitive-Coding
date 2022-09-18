package September;

class CompositeAndPrime {
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public int Count(int L, int R)
    {
       int cnt = 0 , composite = 0;
       if(L==1){
           L = L + 1;
       }
        
        for(int i = L ; i <= R ; i++ ){
            if(isPrime(i)){
                cnt++;
            }
            else{
                composite++;
            }
        }
        return (composite - cnt);
    }
}
