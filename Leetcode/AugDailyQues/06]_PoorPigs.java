package Leetcode.AugDailyQues;

class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int test = minutesToTest/minutesToDie;
        int i=0;
        while(Math.pow(test+1,i)< buckets){
            i++;
        }
        return i;
    }
}
