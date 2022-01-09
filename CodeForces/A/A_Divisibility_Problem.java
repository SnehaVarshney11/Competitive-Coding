package CodeForces.A;
import java.util.Scanner;

public class A_Divisibility_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a%b == 0){
                System.out.println("0");
            }else{
                int c = a%b;
                System.out.println(b - c);
            }
        }
    }
}