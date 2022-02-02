import java.util.Scanner;

class EVM_Hacking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();

            int half = (p + q + r)/2;
            if(p+b+c > half || a+q+c > half || a+b+r > half){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}