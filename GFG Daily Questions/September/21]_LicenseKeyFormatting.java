package September;

class LicenseKeyFormatting {
    static String ReFormatString(String S, int K){
        // code here
        S = S.toUpperCase();
        
        
        String ans = "";
        String group = "";
    
        
        for(int i=S.length()-1; i>=0; i--){
            char ch = S.charAt(i);
            if(ch != '-')
                group+=Character.toString(ch);
            
            if(group.length() == K){
                ans += group;
                ans += "-";
                group = "";
            }
        }
        
        ans += group;
        
        if(ans.length() > 1 && ans.charAt(ans.length()-1) == '-')
            ans = ans.substring(0, ans.length()-1);
        
        StringBuilder str = new StringBuilder(ans);
        ans = str.reverse().toString();
            
        return ans;
    }
}
