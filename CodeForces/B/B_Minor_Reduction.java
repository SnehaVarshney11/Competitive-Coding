package CodeForces.B;
import java.util.Scanner;

public class B_Minor_Reduction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            int str_max = (s.charAt(0) + s.charAt(1) - '0' - '0');
            int index = 0;

            for(int i = 0; i < n-1; i++){
                int sum = (s.charAt(i) - '0' + s.charAt(i+1) - '0');
                if(sum >= 10){
                    str_max = sum;
                    index = i;
                }
            }
            for(int i = 0; i < n; i++){
                if(i == index){
                    System.out.println(str_max);
                    i++;
                    continue;
                }
                System.out.print(s.charAt(i));
            }
        }
    }
}