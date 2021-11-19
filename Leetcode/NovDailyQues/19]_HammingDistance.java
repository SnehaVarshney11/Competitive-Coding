package NovDailyQues;

class HammingDistance {
    public int hammingDistance(int x, int y) {
        String str = Integer.toBinaryString(x ^ y);
        int sum = 0;
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                sum++;
            }
        }
        return sum;
    }    
}
