import java.util.Scanner;

class Alternating_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int zero = 0, one = 0;

            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '0'){
                    zero++;
                }else{
                    one++;
                }
            }
            int max = Math.max(zero, one);
            int min = Math.min(zero, one);

            if(min == max){
                System.out.println(2 * min);
            }else{
                System.out.println(2 * min+1);
            }
        }
    }
}