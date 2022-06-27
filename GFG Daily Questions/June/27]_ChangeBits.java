package June;

class ChangeBits {
    static int[] changeBits(int N) {
        // code here
        String b = Integer.toBinaryString(N);
        String ans = "";
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)=='0')
            ans=ans.concat("1");
            else
            ans=ans.concat("0");
        }
        //m is converting the ans(xor value of N) to integer type from bits
        int m=Integer.valueOf(ans,2);
        int arr[]=new int[2];
        arr[0]=m;
        arr[1]=m+N;
        return arr;
    }
}
