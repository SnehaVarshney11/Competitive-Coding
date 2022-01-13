package CodeForces.B;
import java.util.Arrays;
import java.util.Scanner;

public class B_Two_Arrays_And_Swaps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int s = 0;

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                s += a[i];
            }
            Arrays.sort(a);
            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(b);

            int i = 0, j = n - 1;
            while(k > 0 && i < n && j >= 0){
                if(a[i] < b[j]){
                    s += b[j] - a[i];
                    i++;
                    j--;
                    k--;
                }else{
                    break;
                }
            }
            System.out.println(s);
        }
    }
}