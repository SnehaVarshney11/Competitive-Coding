package CodeForces.A;
import java.util.Scanner;

public class A_Translation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String s = sc.next();
        String t = sc.next();
        StringBuilder sb = new StringBuilder(t);
        if(s.equals(sb.reverse().toString())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}