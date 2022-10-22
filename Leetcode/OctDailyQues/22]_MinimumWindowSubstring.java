package Leetcode.OctDailyQues;

class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(s==null || t==null) return "";
        String res="";
        int[] letterCount = new int[128]; // for ASCII
        int l=0, count=0, min=Integer.MAX_VALUE;
        
        for(char c : t.toCharArray()){
            ++letterCount[c];
        }
        for(int r=0; r<s.length(); r++){
            if(--letterCount[s.charAt(r)]>=0){
                ++count;
            }
            while(count==t.length()){
                if(min>r-l+1){
                    min=r-l+1;
                    res=s.substring(l,r+1);
                }
                if(++letterCount[s.charAt(l)]>0){
                    --count;
                }
                ++l;
            }
        }
        return res;
    }
}
