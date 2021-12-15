import java.util.Scanner;

class Two_vs_Ten{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x % 10 == 0){
                System.out.println(0);
            }
            else if(x % 10 == 5) {
                System.out.println(1);
            }
            else  
                System.out.println(-1);
        }
    }
}