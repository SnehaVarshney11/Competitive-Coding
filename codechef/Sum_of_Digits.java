import java.util.Scanner;

class Sum_of_Digits{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0;
            while(n != 0){
                int rem = n%10;
                sum = sum + rem;
                n = n/10;
            }
            System.out.println(sum);
        }
    }
}