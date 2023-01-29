package StudyPlan.Algorithm;

public class ReverseBit {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }

        int result = 0;
        int power = 31;

        while (n != 0) {
            result |= (n & 1) << power;
            n >>>= 1;
            power--;
        }

        return result;
    }
}
