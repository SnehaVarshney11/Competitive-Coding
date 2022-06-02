import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Solution by - @snehavarshney
 
class Chef_and_Brain_Speed {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader sc = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver solver = new solver();
        solver.solve(sc, out);
        out.close();
    }
 
    static class solver {
        public void solve(InputReader sc, PrintWriter out) {
            int t =1;
            while(t-->0){
              int x = sc.nextInt();
              int y = sc.nextInt();

              if(x<y){
                out.println("YES");
              }else{
                out.println("NO");
              }
            }
        }
    }
 
    static class InputReader {
        public BufferedReader read;
        public StringTokenizer Token;
        public InputReader(InputStream stream) {
            read = new BufferedReader(new InputStreamReader(stream), 32768);
            Token = null;
        }
        public String next() {
            while (Token == null || !Token.hasMoreTokens()) {
                try {
                    Token = new StringTokenizer(read.readLine());
                } catch (IOException RuntimeException) {
                    throw new RuntimeException(RuntimeException);
                }
            }
            return Token.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong(){
            return Long.parseLong(next());
        }
        public boolean nextBoolean(){
            return Boolean.parseBoolean(next());
        }
 
    }
}