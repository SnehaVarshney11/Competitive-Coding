import java.util.Arrays;
import java.util.Scanner;

class Maximize_the_Minimum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); // size of array
            int k = sc.nextInt(); //maximum number of operations allowed respectively
            int[] ar = new int[n];

            for(int i = 0; i < n; i++){
                ar[i] = sc.nextInt();
            }
            Arrays.sort(ar);

            System.out.println(ar[Math.min(k, n-1)]);
        }
    }
}