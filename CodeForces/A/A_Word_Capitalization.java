package CodeForces.A;
import java.util.Scanner;

public class A_Word_Capitalization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String str = sc.next();
        char[] ch = str.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for(int i = 0; i < str.length(); i++){
            System.out.print(ch[i]);
        }
    }
}