class ASpecialKeyboard {
    static int findTime(String S1 , String S2) {
        // code here
        int time = 0, pos = 0;
        for(int i = 0; i < S2.length(); i++){
            time += Math.abs(S1.indexOf(S2.charAt(i)) - pos);
            pos = Math.abs(S1.indexOf(S2.charAt(i)));
        }
        return time;
    }
}
