package Love_Babbar_Cheat_Sheet.Array;

import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter array");
        int[] ar = new int[n];

        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }

        System.out.println("After reverse the array is:");
        for(int i = n-1; i >= 0; i--){
            System.out.print(ar[i] + " ");
        }
    }    
}
