import java.util.Scanner;

class Distinct_Binary_Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 1;

            for(int i = 1; i < n; i++){
                if(s.charAt(i-1) != s.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}