class LargestNumberWithGivenSum {
    static String largestNumber(int n, int sum)
    {
        // add your code here
        String str = "";
        if(9*n < sum) return "-1";
        else{
            int k = 9;
            for(int i = 0; i < n; i++){
                if(sum == 0){
                    str += "0";
                    continue;
                }
                while(k > sum){
                    k--;
                }
                str += String.valueOf(k);
                sum -= k;
                k = 9;
            }
        }
        return str;
    }
}
