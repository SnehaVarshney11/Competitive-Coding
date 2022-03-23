package Practice.Arrays;
import java.util.Arrays;
import java.util.Scanner;

class The_Army{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] ar = new int[m];
            for(int i = 0; i < m; i++){
                ar[i] = sc.nextInt();
            }
            Arrays.sort(ar);
            int f = ar[0];
            int l = ar[m-1];

            for(int i = 0; i < n; i++){
                int ans = Math.max(Math.abs(i-f), Math.abs(i-l));
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}