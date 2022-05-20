class TransformString {
    int transform (String A, String B)
    {
        // code here
        int n = A.length();
        int m = B.length();
        if(n != m) return -1;
        int[] ar = new int[256]; //frequenCY ARRAY
        for(int i = 0; i < n; i++){
            ar[A.charAt(i)]++;
            ar[B.charAt(i)]--;
        }
        for(int i = 0; i < 256; i++){
            if(ar[i] != 0) return -1;
        }
        int ans = 0;
        int i = n-1, j = n-1;
        while(i >= 0){
            if(A.charAt(i) != B.charAt(j)){
                ans++;
            }else{
                j--;
            }
            i--;
        }
        return ans;
    }
}
