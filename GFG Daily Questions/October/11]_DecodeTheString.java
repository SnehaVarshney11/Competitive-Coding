package October;

import java.util.ArrayDeque;

class DecodeTheString {
    static String decodedString(String s){
        // code here
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Character> ad = new ArrayDeque<>();
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == ']') {
                String temp = "";
                while(!ad.isEmpty() && ad.peekLast() != '[') {
                    temp = ad.pollLast() + temp;
                }
                ad.pollLast();
                int res = 0;
                int ten = 1;
                while(!ad.isEmpty() && ad.peekLast() >= '0' && ad.peekLast() <= '9') {
                    res = res + ((ad.pollLast() - '0') * ten);
                    ten *= 10;
                }
                for(int j=0;j<res;j++) {
                    for(int k=0;k<temp.length();k++) {
                        ad.offerLast(temp.charAt(k));
                    }
                }
            }else {
                ad.offerLast(s.charAt(i));
            }
            // System.out.println(ad.toString());
        }
        while(!ad.isEmpty()) {
            sb.append(ad.pollFirst());
        }
        return String.valueOf(sb);
    }
}
