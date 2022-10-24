package Leetcode.OctDailyQues;

import java.util.List;

class MaximumLength {
    int mx =0;
    public int maxLength(List<String> arr) {
        BT(arr,"",0);
        return mx;
    }
    
    private void BT(List<String> arr, String current, int start){
        if(mx<current.length())
            mx =current.length();
        for(int i=start; i<arr.size();i++){
            if(!Valid(current,arr.get(i))) continue;
            BT(arr,current+arr.get(i),i+1);
        }
    }
    
    private boolean Valid(String currentString, String newString){
        int[] array = new int[26];
        for(int i=0;i<newString.length();i++){
            if(++array[newString.charAt(i)-'a'] == 2) return false; 
            if(currentString.contains(newString.charAt(i)+"")) 
                return false;
        }
        return true;
    }
}
