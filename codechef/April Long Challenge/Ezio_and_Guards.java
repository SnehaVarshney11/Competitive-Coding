import java.io.*;
import java.util.*;

// solution --> @varsneha
jlsd
class Ezio_and_Guards{
    public static void main(String[] args) throws Exception {
        InputReader sc = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        Solution Solver = new Solution();

        int testNumber = sc.nextInt();
        for (int i = 1; i <= testNumber; i++) {
            Solver.solveTestcase(i, sc, out);
        }
        out.close();
    }
    private static class Solution {
        public void solveTestcase(int testNumber, InputReader sc, OutputWriter out) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x >= y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}

class InputReader {
    private static final int Buffer_Size = 1<<10;

    private InputStream stream;
    private byte[] Buffer = new byte[Buffer_Size];
    private int currChar;
    private int NumChars;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public int[] nextInts(int n) {
        int[] IntArray = new int[n];
        for (int i = 0; i < n; i++) {
            IntArray[i] = nextInt();
        }
        return IntArray;
    }

    public int[][] nextIntMatrix(int n, int m) {
        int[][] IntMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                IntMatrix[i][j] = nextInt();
            }
        }
        return IntMatrix;
    }

    public long[] nextLongs(int n) {
        long[] LongArray = new long[n];
        for (int i = 0; i < n; i++) {
            LongArray[i] = nextLong();
        }
        return LongArray;
    }

    public long[][] nextLongMatrix(int n, int m) {
        long[][] LongMatrix = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                LongMatrix[i][j] = nextLong();
            }
        }
        return LongMatrix;
    }

    public double[] nextDoubles(int n) {
        double[] DoubleArray = new double[n];
        for (int i = 0; i < n; i++) {
            DoubleArray[i] = nextDouble();
        }
        return DoubleArray;
    }

    public double[][] nextDoubleMatrix(int n, int m) {
        double[][] DoubleMatrix = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                DoubleMatrix[i][j] = nextLong();
            }
        }
        return DoubleMatrix;
    }

    public int next() {
        if (NumChars == -1) {
            throw new InputMismatchException();
        }
        if (currChar >= NumChars) {
            currChar = 0;
            try {
                NumChars = stream.read(Buffer);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (NumChars <= 0)
                return -1;
        }
        return Buffer[currChar++];
    }

    public char nextChar() {
        int c = next();
        while (isSpaceChar(c)) {
            c = next();
        }
        if ('a' <= c && c <= 'z') {
            return (char) c;
        }
        if ('A' <= c && c <= 'Z') {
            return (char) c;
        }
        throw new InputMismatchException();
    }

    public String nextLine() {
        int c = next();
        while (isSpaceChar(c)) {
            c = next();
        }
        StringBuilder ans = new StringBuilder();
        do {
            ans.append((char) c);
            c = next();
        } while (!isSpaceChar(c));
        return ans.toString();
    }

    public int nextInt() {
        int c = skipWhileSpace();
        int Sign = 1;
        if (c == '-') {
            Sign = -1;
            c = next();
        }
        int ans = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            ans *= 10;
            ans += c-'0';
            c = next();
        } while (!isSpaceChar(c));
        return ans*Sign;
    }

    public long nextLong() {
        int c = skipWhileSpace();
        long Sign = 1;
        if (c == '-') {
            Sign = -1;
            c = next();
        }
        long ans = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            ans *= 10;
            ans += c - '0';
            c = next();
        } while (!isSpaceChar(c));
        return ans * Sign;
    }
    
    public double nextDouble() {
        return Double.valueOf(nextLine());
    }

    public int skipWhileSpace() {
        int c = next();
        while (isSpaceChar(c)) {
            c = next();
        }
        return c;
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}

class OutputWriter {
    private final PrintWriter output;

    public OutputWriter(OutputStream outputStream) {
        output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer output) {
        this.output = new PrintWriter(output);
    }

    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0)
                output.print(' ');
            output.print(objects[i]);
        }
    }

    public void println(Object... objects) {
        print(objects);
        output.println();
    }

    public void close() {
        output.close();
    }

    public void flush() {
        output.flush();
    }
}