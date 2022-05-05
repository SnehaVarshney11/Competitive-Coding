package codechef.Practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Can_You_Eat_It{
    public static void main(String[] args) throws java.lang.Exception{
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0){
            String str = br.readLine();
            String words[] = str.split(" ");
            int n = Integer.parseInt(words[0]);
            int k = Integer.parseInt(words[1]);
            if(n%k == 0){
                System.out.println(n/k);
            }
            else{
                System.out.println(-1);
            }
        }
        br.close();
    }
}
