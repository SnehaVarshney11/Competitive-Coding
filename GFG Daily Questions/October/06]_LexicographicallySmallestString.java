package October;

import java.util.ArrayDeque;

class LexicographicallySmallestString {
    static String lexicographicallySmallest(String s, int k) {
        // code here
        int n = s.length();
        if(n != 0 && (n & (n - 1)) > 0) {
            k *= 2;
        }else {
            k /= 2;
        }
        if(k >= n) {
            return "-1";
        }
        int left = n - k;
        ArrayDeque<Character> ad = new ArrayDeque<>();
        for(int i=0;i<n;i++) {
            if(ad.isEmpty()) {
                ad.push(s.charAt(i));
            }else {
                while(!ad.isEmpty() && s.charAt(i) < ad.peek() && (ad.size() - 1 + n - i) >= left) {
                    ad.pop();
                }
                if(ad.size() < left) {
                    ad.push(s.charAt(i));
                }
            }
        }
        char[] ans = new char[left];
        int i = left - 1;
        while(!ad.isEmpty()) {
            ans[i--] = ad.pop();
        }
        return String.valueOf(ans);
    }
}
