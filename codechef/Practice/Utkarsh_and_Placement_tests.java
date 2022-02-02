package Practice;
import java.util.Scanner;

class Utkarsh_and_Placement_tests{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            char a = sc.next().charAt(0);
            char b = sc.next().charAt(0);
            // char c = sc.next().charAt(0);
            char e = sc.next().charAt(0);
            char f = sc.next().charAt(0);

            int lp1 = 0, lp2 = 0;
            if(e == a){
                lp1 = 3;
            }
            else if(e==b){
                lp1 =2;
            }else{
                lp1=1;
            }
            if(f==a){
                lp2=3;
            }else if(f==b){
                lp2=2;
            }else{
                lp2=1;
            }
            if(lp1 > lp2){
                System.out.println(e);
            }else{
                System.out.println(f);
            }
        }
    }
}