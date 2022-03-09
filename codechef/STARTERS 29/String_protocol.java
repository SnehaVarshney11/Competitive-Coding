import java.util.Scanner;

class String_protocol{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int op = 0;
            for(int i = 0; i <= n; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    op = op + 1;
                    i++;
                }else{
                    op = op + 1;
                }
            }
            System.out.println(op);
        }
    }
}