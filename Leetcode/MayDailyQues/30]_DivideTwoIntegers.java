package Leetcode.MayDailyQues;

class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        // Dividend = Quotient * Division + Reminder
        if(dividend == 1<<31 && divisor == -1)
            return Integer.MAX_VALUE;
        boolean sign = (dividend >= 0) == (divisor >= 0) ? true:false;
        
        dividend =  Math.abs(dividend);
        divisor = Math.abs(divisor);
        int res = 0;
        while(dividend - divisor >= 0){
            int count = 0;
            while(dividend - (divisor << 1 << count) >= 0){
                count++;
            }
            res += 1 << count;
            dividend -= divisor << count;
        }
        return sign ? res : -res;
    }
}
