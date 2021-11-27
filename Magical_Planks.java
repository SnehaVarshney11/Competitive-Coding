import java.util.Scanner;

class Magical_Planks{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            Double count = 0.0;
            for(int i = 1; i < n; i++){
                if(s.charAt(i-1) != s.charAt(i)){
                    count = count + 0.5;
                }
            }
            System.out.println((int) Math.round(count));
        }
    }
}