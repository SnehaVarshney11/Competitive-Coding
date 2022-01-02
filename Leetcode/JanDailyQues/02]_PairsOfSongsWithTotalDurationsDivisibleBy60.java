package JanDailyQues;

class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0, cnt[] = new int[60];
        for (int i = 0; i < time.length; i ++) cnt[time[i] % 60] += 1;
        for (int i = 1; i< 30; i ++) ans += cnt[i] * cnt[60 - i];
        return ans + cnt[0] * (cnt[0] - 1) / 2 + cnt[30] * (cnt[30] - 1) / 2;
    }
}
