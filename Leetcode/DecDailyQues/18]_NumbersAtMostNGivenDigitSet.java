package DecDailyQues;

class NumbersAtMostNGivenDigitSet {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String str = n + "";
        int slen = str.length();
        int noOfDigits = digits.length;
        
        int total = 0;
        
        for(int i = 1; i < slen; i++){
            total += Math.pow(noOfDigits, i);
        }
        for(int i = 0; i < slen; i++){
            boolean hasSameNo = false;
            for(String d : digits){
                if(d.charAt(0) < str.charAt(i)){
                    total += Math.pow(noOfDigits, slen - i - 1);
                }else if(d.charAt(0) == str.charAt(i)){
                    hasSameNo = true;
                    if(i == slen - 1){
                        total++;
                    }
                }
            }
            if(!hasSameNo){
                return total;
            }
        }
        return total;
    }    
}
