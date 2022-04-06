//Code by Sneha Varshney
import java.util.Scanner;

class The_Cheaper_Cab{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt(); //prices of first cab
            int y = sc.nextInt(); //prices of second cab
            if(x == y){
                System.out.println("ANY");
            }else if(x > y){
                System.out.println("SECOND");
            }else{
                System.out.println("FIRST");
            }
            sc.close();
        }
    }
}