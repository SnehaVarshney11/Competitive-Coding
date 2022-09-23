package Leetcode.SepDailyQues;

class ConcatenationOfConsecutiveBinaryNumbers {
    public int concatenatedBinary(int n) {
        final long mod = (long) (1e9 + 7);
        long res = 0;
        int binaryDigits = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) binaryDigits++;
            res = ((res << binaryDigits) + i) % mod;
        }
        return (int) res;
    }
}
