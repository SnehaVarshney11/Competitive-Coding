package CodeForces.A;
import java.util.Scanner;

public class A_Bit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int num = sc.nextInt();
        int x=0;
        String a = "++X";
        String b = "X++";
        String[] str = new String[num];
        for(int i=0;i<num;i++)
        {
            String y = sc.next();
            str[i]=y;
        }
        for(int i=0;i<num;i++)
        {
            if(str[i].equals(a) || str[i].equals(b))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}