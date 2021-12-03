package Love_Babbar_Cheat_Sheet.String;

class ReverseString {
    public void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++){    //Do it half the number of String length
            char tmp = s[i];
            s[i] = s[s.length-1-i];     //Front swap with other End side 
            s[s.length-1-i] = tmp; 
        }
    }    
}
