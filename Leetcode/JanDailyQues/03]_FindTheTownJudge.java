package JanDailyQues;

class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] jd = new int[n+1];
        for(int j[] : trust){
            jd[j[0]]--; // if a given person trust someone then decrement the count of his index
            jd[j[1]]++; // increment the count of the index whom he trusts
        }
        for(int i = 1; i <= n; i++){
            if(jd[i] == n-1){ // person doesnt trust anybody but everyone else trust him. Return their index
                return i;
            }
        }
        return -1;
    }
}
