package Leetcode.MayDailyQues;

import java.util.ArrayList;

class MaximumGCDofSiblingsOfBT {
    static int gcd(int a, int b){
        while(a != b){
            if(a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
        // code here
        int max = 0;
        arr.sort((a,b) -> a.get(0)-b.get(0));
        
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i).get(0) == arr.get(i-1).get(0)){
                max = Math.max(max, gcd(arr.get(i).get(1), arr.get(i-1).get(1)));
            }
        }
        return max;
    }
}
