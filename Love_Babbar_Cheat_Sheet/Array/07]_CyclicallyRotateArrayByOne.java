package Love_Babbar_Cheat_Sheet.Array;

import java.util.Arrays;

class CyclicallyRotateArrayByOne {
    static void rotate(int[] ar){
        int x = ar[ar.length-1];
        for(int i = ar.length-1; i > 0; i--){
            ar[i] = ar[i-1];
        }
        ar[0] = x;
    }
    public static void main(String[]args){
        int[] ar = {1,2,3,4,5};
        System.out.println("Given array is: ");
        System.out.println(Arrays.toString(ar));
        //call the method
        rotate(ar);
        System.out.println("Rotated array is: ");
        System.out.println(Arrays.toString(ar));
    }    
}
