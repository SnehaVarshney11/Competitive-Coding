package Leetcode.JuneDailyQues;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ShortEncodingOfWords {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>();
    
        Arrays.sort(words,(a,b)->b.length()-a.length());
        int n = 0;
        for(int i = 0; i < words.length; i++){
            int check = 0;
            for(String str : set){
                if(str.endsWith(words[i])){
                    check = 1;
                    break;
                }    
            }
            if(check == 0){
                n += words[i].length() + 1;
                set.add(words[i]);
            }
        }
        return n;
    }
}
