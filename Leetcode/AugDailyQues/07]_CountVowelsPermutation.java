package Leetcode.AugDailyQues;

class CountVowelsPermutation {
    private static final char[] vowels = new char[]{'a','e','i','o','u'};
    private static final int[] index = new int[26];
    private static final int M = 1000000007;
    public int countVowelPermutation(int n) {
        if(n==1) return 5;
    	index[0] = 0;
    	index['e'-'a'] = 1;
    	index['i'-'a'] = 2;
    	index['o'-'a'] = 3;
    	index['u'-'a'] = 4;
    	Integer[][] dp = new Integer[5][20001];
    	
        return  countVowelPermutation(n, null, 1, dp)%M;
        
    }
    
    public int countVowelPermutation(int n, Character last, int curr, Integer[][]dp) {
    	if(n < curr) return 0;
    	
        if(last != null) {
//        	if(n-curr+1>=0)
        	if(dp[index[last-'a']][n-curr+1] != null ) {
        		//System.out.println("saved");
        		return dp[index[last-'a']][n-curr+1] %M;
        	}
        	long ans = 0;
        	for(char ch : getNext(last)) {
        		if(n > curr)
        		if(dp[index[ch-'a']][n-curr] != null) {
        			ans  = (ans + dp[index[ch-'a']][n-curr])%M;
        			//System.out.println("saved");
        		}else {
        			if(n > curr)
            		dp[index[ch-'a']][n-curr] = (countVowelPermutation(n, ch, curr+1, dp)%M);
            		if(n < curr)
            		ans  = (ans + dp[index[ch-'a']][n-curr-1])%M;
            		else ans = (ans + countVowelPermutation(n, ch, curr+1, dp)%M);
            		//if(n > curr)
            		//System.out.println("for: "+ ch + " with remaining:"+ (n-curr) + "dp :"+  dp[index[ch-'a']][n-curr]);
        		}
        		
        	}
        	if(ans == 0) {
        		dp[index[last-'a']][n] = (getNext(last).length%M);
        		return (int)(getNext(last).length%M);
        	}
        	dp[index[last-'a']][n] = (int)(ans%M);
        	return (int)(ans%M);
        	
        }else {
        	long ans = 0;
        	for(char ch : vowels) {
        		
        		ans = (ans + countVowelPermutation(n, ch, curr+1,dp));
        	}
        	
        	return (int)(ans%M);
        }
    }
    
    private char[] getNext(char ch){
        switch(ch){
            case 'a':{
                    char[] temp = new char[]{'e'};
                    return temp;
                }
            case 'e':{
                    char[] temp = new char[]{'a', 'i'};
                    return  temp;
                }
            case 'i':{
                    char[] temp = new char[]{'a','e','o','u'};
                    return temp;
                }
            case 'o': {
                    char[] temp = new char[]{'i', 'u'};
                    return temp;
                }
            case 'u':{
                    char[] temp = new char[]{'a'};
                    return temp;
                }
            default :{
                    return new char[]{};
                }
        }
        
    }
}
