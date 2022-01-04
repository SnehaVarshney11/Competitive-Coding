package CodeForces.B;
import java.util.Scanner;

public class B_01_Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t--> 0){
            char[] ch = sc.next().toCharArray();
            int zero = 0, one = 0;
            for(int i = 0; i < ch.length; i++){
                if(ch[i] == '0'){
                    zero++;
                }else{
                    one++;
                }
            }
            System.out.println(Math.min(zero, one) % 2 == 1 ? "DA" : "NET");
        }
    }
}