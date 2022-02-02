package Practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Chef_and_Stock_Prices_{
    public static void main(String[] args) throws java.lang.Exception{
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0){
            String str = br.readLine();
            String words[] = str.split(" ");
            double s = Integer.parseInt(words[0]);
            double a = Integer.parseInt(words[1]);
            double b = Integer.parseInt(words[2]);
            double c = Integer.parseInt(words[3]);
            double change = (c * s / 100);
            double finalPrice = 0;
            finalPrice = s + change;
            if(finalPrice >= a && finalPrice <= b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        br.close();
    }
}