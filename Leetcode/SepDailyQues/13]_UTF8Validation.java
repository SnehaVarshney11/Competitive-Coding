package Leetcode.SepDailyQues;

class UTF8Validation {
    public boolean validUtf8(int[] data) {
        int mask = 128, n = 0;
        for(int i=0; i<data.length; i++){
            if(n!=0){
                if(calc(data[i])!=-1) return false;
                n--; continue;
            }
            n = (mask&data[i])==0 ? 0 : calc(data[i])-1; 
            if(n<0 || i+n>=data.length) return false;
            if(n>0 && ((mask>>n+1)&data[i])!=0) return false;
        }
        return n==0;
    }

    int calc(int val){
        int n = 0;
        for(int mask = 128; (mask&val)!=0 && n!=4; n++)
            val = val<<1;
        return n==1 ? -1 : n;
    }
}
