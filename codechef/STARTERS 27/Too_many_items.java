import java.util.Scanner;

class Too_many_items{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = n % 10;
            if(x == 0){
                System.out.println(n/10);
            }else{
                System.out.println((n/10)+1);
            }
        }
    }
}