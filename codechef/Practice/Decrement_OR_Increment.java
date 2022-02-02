package Practice;
import java.util.Scanner;

class Decrement_OR_Increment{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        if(n % 4 == 0){
            n++;
        }else{
            n--;
        }
        System.out.println(n);
    }
}