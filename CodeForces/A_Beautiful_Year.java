package CodeForces;
import java.util.Scanner;

public class A_Beautiful_Year{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
         String year = sc.nextLine(); 
        for(int i = 1000; i <= 9000; i++){
            year = String.valueOf(Integer.parseInt(year) + 1);
            if(year.charAt(0)!=year.charAt(1) && year.charAt(0)!=year.charAt(2)
               && year.charAt(0)!=year.charAt(3) && year.charAt(1)!=year.charAt(2)
               && year.charAt(1)!=year.charAt(3) && year.charAt(2)!=year.charAt(3))
                break;
        }
         System.out.println(year);
    }
}