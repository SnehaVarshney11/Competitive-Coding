import java.util.Scanner;

class Small_Factorial{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int fact = 1;
            for(int i = 1; i <= n; i++){
                fact *= i;
            }
            System.out.println(fact);
        }
    }
}