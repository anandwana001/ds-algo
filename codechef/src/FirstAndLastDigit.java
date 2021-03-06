package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FirstAndLastDigit {

    public static void main(String[] args) {
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);
        int T = in.nextInt();

        while(T-- >0){
            int n = in.nextInt();
            System.out.println( (n % 10) + firstDigit(n));
        }
    }

    private static int firstDigit(int n) {
        while (n > 9) {
            n /= 10;
        }
        return n;
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
