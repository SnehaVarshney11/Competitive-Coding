class MaximumIndex {
    static int maxIndexDiff(int A[], int N) { 
        
        // Your code here
        int i = 0, j = N-1, ans = 0;
        
        while(i <= j){
            if(A[i] <= A[j]){
                ans = Math.max(ans, j-i);
                i++;
                j = N-1;
            }else{
                j--;
            }
        }
        return ans;
    }
}
