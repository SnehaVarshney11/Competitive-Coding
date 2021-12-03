import java.io.BufferedReader;
import java.io.InputStreamReader;

class Can_Reach{
    public static void main(String[] args) throws java.lang.Exception{
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0){
            String str = br.readLine();
            String words[] = str.split(" ");
            int x = Integer.parseInt(words[0]);
            int y = Integer.parseInt(words[1]);
            int k = Integer.parseInt(words[2]);
            if(x % k == 0 && y % k == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        br.close();
    }
}
