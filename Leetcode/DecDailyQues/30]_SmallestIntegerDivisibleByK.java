package DecDailyQues;

class SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k) {
        int n = 0;
        for (int i = 0; i < k; i ++) { 
            n = (n * 10 + 1) % k; 
            if (n == 0) return i + 1; 
        }
        return -1;  
    }
}
