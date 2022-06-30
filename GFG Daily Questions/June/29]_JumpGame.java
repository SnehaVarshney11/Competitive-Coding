package June;

class JumpGame{
    static int canReach(int[] A, int N) {
        // code here
        
    int left = N-2;
        int right = N-1;
        while(left>=0&&right>=0) {
            if(right-left<=A[left]) {
                right = left;
                left--;
            }
            else {
                left--;
            }
        }
        return right==0 ? 1 : 0;
    }
}