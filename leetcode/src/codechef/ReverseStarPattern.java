package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseStarPattern {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        int n = in.nextInt();

        int i, k, flag = 1;

        for(i = 1, k = 0; i <= 2 * n - 1; i++){

            if (i < n - k)
                System.out.print(" ");
            else
            {
                if (flag == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

                flag = 1 - flag;
            }

            if (i == n + k)
            {
                k++;
                System.out.println();

                if (i == 2 * n - 1)
                    break;
                
                i = 0;
                flag = 1;
            }
        }

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
