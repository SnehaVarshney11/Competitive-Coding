package Love_Babbar_Cheat_Sheet.Array;

import java.util.Arrays;

class FindKthSmallest {
    public static int KthSmallest(int[] ar, int k){
        Arrays.sort(ar);
        return ar[k-1];
    }
    public static void main(String[] args){
        int[] ar = {12, 3, 5, 7, 19};
        int k = 2;
        System.out.print("K'th smallest element is " + KthSmallest(ar, k));
    }    
}
