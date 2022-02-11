package FebDailyQues;

import java.util.Arrays;

class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        int count1[]=new int[256];
        int count2[]=new int[256];
        for(int i=0;i<s1.length();i++)
        {
            count1[s1.charAt(i)]++;
            count2[s2.charAt(i)]++;
        }
        
        if(Arrays.equals(count1,count2))
            return true;
        
        for(int i=s1.length();i<s2.length();i++)
        {
            count2[s2.charAt(i)]++;
            count2[s2.charAt(i-s1.length())]--;
            
            if(Arrays.equals(count1,count2))
                return true;
        }
        
        return false;
    }
}
