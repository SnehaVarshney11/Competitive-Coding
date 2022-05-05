package codechef.Practice;
import java.util.Scanner;

class Check_Mate{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int xk = sc.nextInt();
            int yk = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            String ans = "NO";

            if(!(xk == 1 || xk == 8 || yk == 1 || yk == 8)){
                //king not near border
                ans = "NO";
            }else{
                if(xk == 1){
                    if((x1 == 2 || x2 == 2) && y1 != y2){
                        if(Math.abs(y1-yk) > 1 && Math.abs(y2-yk) > 1){
                            ans = "YES"; 
                        }
                    }
                   
                }
                else if(xk == 8){
                    if((x1 == 7 || x2 == 7) && y1 != y2){
                        if(Math.abs(y1-yk) > 1 && Math.abs(y2-yk) > 1){
                            ans = "YES"; 
                        }
                    }
                }
                if(yk == 1){
                    if((y1 == 2 || y2 == 2) && x1 != x2){
                        if(Math.abs(x1-xk) > 1 && Math.abs(x2-xk) > 1){
                            ans = "YES"; 
                        }
                    }
                }
                else if(yk == 8){
                    if((y1 == 7 || y2 == 7) && x1 != x2){
                        if(Math.abs(x1-xk) > 1 && Math.abs(x2-xk) > 1){
                            ans = "YES"; 
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}