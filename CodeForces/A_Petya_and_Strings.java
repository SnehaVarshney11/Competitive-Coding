package CodeForces;
import java.util.Scanner;

public class A_Petya_and_Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String first = sc.next();
        String second = sc.next();

        String str1 = first.toLowerCase();
        String str2 = second.toLowerCase();

        if(str1.compareTo(str2) ==0){
            System.out.println("0");
        }
        if(str1.compareTo(str2) > 0){
            System.out.println("1");
        }
        if(str1.compareTo(str2) < 0){
            System.out.println("-1");           
        }
    }
}