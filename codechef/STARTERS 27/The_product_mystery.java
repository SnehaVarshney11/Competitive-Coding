import java.util.Scanner;

class The_product_mystery{
    static int findgcd(int b, int c){
        int gcd = 1;
        for(int i = 1; i <= b && i <= c; i++){
            if(b % i == 0 && c % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int a = c/findgcd(b, c);;
            System.out.println(a);
        }
    }
}