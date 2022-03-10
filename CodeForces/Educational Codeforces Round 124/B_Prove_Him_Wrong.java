import java.util.Scanner;

public class B_Prove_Him_Wrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] ar = new int[n];
            ar[0] = 1;
            for(int i = 1; i < n; i++){
                ar[i] = 3 * ar[i-1] + 1;
            }
            boolean ch = false;
            for(int i = 0; i < n; i++){
                if(ar[i] > 1000000000){
                    System.out.println("NO");
                    ch = true;
                    break;
                }
            }
            if(ch){
                continue;
            }
            System.out.println("YES");
            for(int i = 0; i < n; i++){
                System.out.print(ar[i] + " ");
            }
            System.out.println();
        }
    }
}