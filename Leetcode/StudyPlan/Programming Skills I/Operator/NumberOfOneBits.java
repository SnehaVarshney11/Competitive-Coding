class NumberOfOneBits {
    public int hammingWeight(int n) {
        int count = 0;
        // The java.lang.Integer.toBinaryString() method returns a string representation of the integer argument as an unsigned integer in base 2.
        char[] ar = Integer.toBinaryString(n).toCharArray();
        for(char c : ar){
            if(c == '1')
                count++;
        }
        return count;
    }    
}
