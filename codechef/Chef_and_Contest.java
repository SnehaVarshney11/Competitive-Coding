import java.util.Scanner;

class Chef_and_Contest{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();

            int chef = x + p * 10;
            int chefina = y + q * 10;

            if(chef < chefina){
                System.out.println("Chef");
            }else if(chef > chefina){
                System.out.println("Chefina");
            }else{
                System.out.println("Draw");
            }
        }
    }
}