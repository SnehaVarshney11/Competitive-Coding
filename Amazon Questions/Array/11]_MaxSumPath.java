class MaxSumPath {
    int maxPathSum(int ar1[], int ar2[])
    {
        // Your code here
        int n = ar1.length, m = ar2.length;
        int i = 0, j = 0;
        int res = 0, sum1 = 0, sum2 = 0;
        
        while(i < n && j < m){
            if(ar1[i] < ar2[j]){
                sum1 += ar1[i++];
            }else if(ar1[i] > ar2[j]){
                sum2 += ar2[j++];
            }else{
                res += Math.max(sum1, sum2) + ar1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        while(i < n){
            sum1 += ar1[i++]; 
        }
        while(j < m){
            sum2 += ar2[j++];
        }
        res += Math.max(sum1, sum2);
        return res;
    }
}
