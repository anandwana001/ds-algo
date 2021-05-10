package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class XorEquality {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        int T = in.nextInt();
        while (T-- > 0) {
            long n = in.nextInt();
            System.out.println(fast_pow(2, n - 1, 1000000007));
        }
    }

    private static long fast_pow(long base, long n, long M) {
        if (n == 0)
            return 1;
        if (n == 1)
            return base;
        long halfn = fast_pow(base, n / 2, M);
        if (n % 2 == 0)
            return (halfn * halfn) % M;
        else
            return (((halfn * halfn) % M) * base) % M;
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

/**
 * In Codechef this not worked in Java due to data type issue. Solved in C++
 * <p>
 * <p>
 * #include <iostream>
 * #include <math.h>
 * using namespace std;
 * <p>
 * int fast_pow(long long base, long long n,long long M)
 * {
 * if(n==0)
 * return 1;
 * if(n==1)
 * return base;
 * long long halfn=fast_pow(base,n/2,M);
 * if(n%2==0)
 * return ( halfn * halfn ) % M;
 * else
 * return ( ( ( halfn * halfn ) % M ) * base ) % M;
 * }
 * <p>
 * int main() {
 * // your code goes here
 * int t = 0;
 * cin>>t;
 * while(t-- >0) {
 * long long n = 0;
 * cin>>n;
 * long long ans = fast_pow(2, n-1, 1000000007);
 * cout<< ans << endl;
 * }
 * return 0;
 * }
 */
