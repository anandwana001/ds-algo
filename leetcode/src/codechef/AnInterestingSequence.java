package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AnInterestingSequence {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        int[] ans = generatePhi();

        int T = in.nextInt();
        while (T-- > 0) {
            int k = in.nextInt();
            System.out.println(ans[4 * k + 1]);
        }
    }

    private static int[] generatePhi() {
        int N = 4000005;
        int[] phi = new int[4000005];
        int[] ans = new int[4000005];

        for(int i=0; i<N; i++) {
            phi[i] = i;
            ans[i] = 0;
        }

        for(int i = 2; i<N; i++) {
            if(phi[i] == i){
                phi[i] = i - 1;
                for(int j =  2 * i; j<N; j+=i) {
                    phi[j] = (phi[j]/i) * (i-1);
                }
            }
        }

        for(int i = 1; i<N; i++) {
            ans[i] += i -1;
            for(int j = 2 * i; j<N; j+=i){
                ans[j] += i * ((1 + phi[j/i]) / 2);
            }
        }

        return ans;
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
