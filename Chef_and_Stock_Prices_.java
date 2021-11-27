import java.util.Scanner;

class Chef_and_Stock_Prices_{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
    
        int t = sc.nextInt();
        while(t-->0){
            int s = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int rup = s - c;

            if(rup >= a && rup <= b){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}