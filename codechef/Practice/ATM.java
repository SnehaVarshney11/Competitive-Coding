package Practice;
import java.util.Scanner;

class ATM
{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int cash = sc.nextInt();
        float balance = sc.nextFloat();
        float charge = 0.5f;

        if(cash % 5 == 0 && (cash + charge) <= balance){
            balance = balance - cash - charge;
        }
        System.out.printf("%.2f",balance);
    }
}