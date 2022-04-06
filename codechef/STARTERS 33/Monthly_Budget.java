import java.util.Scanner;

//Code By Sneha Varshney
class Monthly_Budget{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt(); //amount of money Akshat has for the current month
            int y = sc.nextInt(); //his daily expenditure
            if((y*30) < x){
                System.out.println("YES");
            }else if((y*30) == x){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            sc.close();
        }
    }
}