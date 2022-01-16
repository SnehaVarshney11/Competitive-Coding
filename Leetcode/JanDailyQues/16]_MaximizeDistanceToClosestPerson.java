package JanDailyQues;

class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int pre_zeros = -1, suf_zeros = -1, max_zeros = -1, zeros = 0;
        for (int i = 0; i < seats.length; i ++) {
            if (seats[i] == 0) {
                zeros ++;
            } else {
                if (pre_zeros == -1) {
                    pre_zeros = zeros;
                } else {
                    max_zeros = Math.max(max_zeros, zeros);
                }
                zeros = 0;
            }
        } 
        suf_zeros = zeros;
        return Math.max(Math.max(pre_zeros, suf_zeros), (max_zeros + 1) / 2);
    }
}
