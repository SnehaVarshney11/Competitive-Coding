package Leetcode.JulyDailyQues;

import java.util.Arrays;

class MaxAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        long maxH = maxDist(h, horizontalCuts);
        long maxV = maxDist(w, verticalCuts);
 
         return  (int) ((maxH * maxV) % 1000000007);
     }
     
     public long maxDist(int length, int[] input){
         Arrays.sort(input);
         
         long maxDist = input[0];
         
         for(int i = 1; i < input.length; i ++){
             maxDist = Math.max(maxDist, input[i] - input[i-1]);
         }     
          maxDist = Math.max(maxDist, length - input[input.length-1]);
         return maxDist;
     }
}
