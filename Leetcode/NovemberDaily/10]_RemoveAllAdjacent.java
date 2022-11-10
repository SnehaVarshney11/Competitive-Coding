package Leetcode.NovemberDaily;

class RemoveAllAdjacent {
    public String removeDuplicates(String s) {
        char[] ch = new char[s.length()];
        int i = 0;
        
        for(int j = 0; j < s.length(); j++){
            if(i > 0 && ch[i - 1] == s.charAt(j)){
                i--;
            }
            else{
                ch[i] = s.charAt(j);
                i++;
            }
        }
        return new String(ch, 0, i);
    }
}
