package JanDailyQues;

class ComplementOfBase10Integer {
    public int bitwiseComplement(int n) {
        //Base Case
        if(n == 0) return 1;
        int res = 0, fact = 1;
        
        while(n > 0){
            res += fact * (n % 2 == 0 ? 1 : 0); //find complement
            fact *= 2;
            n /= 2;
        }
        return res;
    }
}
