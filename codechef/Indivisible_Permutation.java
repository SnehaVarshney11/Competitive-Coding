import java.util.Scanner;

class Indivisible_Permutation{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.print(n + " ");

            for(int i = 1; i <= n-1; i++){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}