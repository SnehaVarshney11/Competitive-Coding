package Practice;
import java.util.Scanner;

class Enormous_Input_Test{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            if(t % k == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}