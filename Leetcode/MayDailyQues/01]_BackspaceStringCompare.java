package Leetcode.MayDailyQues;

class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '#'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
               continue;
            }
            s1.push(ch);
        }
        for(char ch : t.toCharArray()){
            if(ch == '#'){
                if(!s2.isEmpty()){
                    s2.pop();
                }
               continue;
            }
            s2.push(ch);
        }
        return s1.equals(s2);
    }
}