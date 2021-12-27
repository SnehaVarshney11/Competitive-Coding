package CodeForces;
import java.util.Scanner;

public class A_Anton_and_Danik{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        // int n = sc.nextInt();
        String str = sc.next();
        int anton = 0, danik = 0;
        for(char c : str.toCharArray()){
            if(c == 'D'){
                danik++;
            }else{
                anton++;
            }
        }
        if(anton > danik){
            System.out.println("Anton");
        }else if(danik > anton){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}