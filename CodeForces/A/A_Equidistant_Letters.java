package CodeForces.A;
import java.util.Arrays;
import java.util.Scanner;

public class A_Equidistant_Letters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            System.out.println(String.valueOf(ch));
        }
    }
}