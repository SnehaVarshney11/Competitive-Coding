class FindAnReplaceInString{
    static String findAndReplace(String S, int Q, int[] index, String[] sources, String[] targets) {
        // code here
        String res = "";
        int last = 0;
        for(int i = 0; i < Q; i++){
            res += S.substring(last, index[i]);
            last = index[i];
            if(sources[i].equals(S.substring(index[i],index[i]+sources[i].length()))){
                res += targets[i];
                last += sources[i].length();
            }
        }
        res += S.substring(last);
        return res;
    }
}