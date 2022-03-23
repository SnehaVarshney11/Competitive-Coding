import java.util.Scanner;

class Economics_Class{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] s = new int[n];
            for(int i = 0; i < n; i++){
                s[i] = sc.nextInt();
            }
            int[] d = new int[n];
            for(int i = 0; i < n; i++){
                d[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0; i < n; i++){
                if(s[i] == d[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}