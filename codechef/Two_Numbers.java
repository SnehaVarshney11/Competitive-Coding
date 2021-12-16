import java.util.Scanner;

class Two_Numbers{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            if(n % 2!= 0){
                a = a*2;
            }
              int max= Math.max(a,b);
              int min=Math.min(a,b);
              System.out.println(max/min);
        }
    }
}