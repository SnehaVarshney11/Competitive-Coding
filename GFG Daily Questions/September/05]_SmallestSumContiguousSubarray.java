package September;

class SmallestSumContiguousSubarray {
    static int smallestSumSubarray(int a[], int size)
    {
        // your code here
        int ans=Integer.MAX_VALUE;
        int sum=0;
        for(int u:a){
            sum+=u;
            sum=Math.min(sum,u);
            ans=Math.min(sum,ans);
        }
        
        return ans;
    }
}
