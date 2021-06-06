import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHFHEIST {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        int T = in.nextInt();
        while (T-- > 0) {
            int D = in.nextInt();
            int d = in.nextInt();
            int p = in.nextInt();
            int q = in.nextInt();
            // AP with multiplication of common difference
            // AP = n/2(2a+(n-1)d)
            // 1. find n -> D/d
            int n = D/d;
            // 2. apply d*n/2(2p+(n-1)q) where q is difference, p is starting money, n is last even day from D range
            int ans = 0;

            if (n % 2 == 0) {
                ans = d * n/2 * (2 * p + (n - 1) * q);
            } else {
                ans = d * n * (p + ((n - 1)/2) * q);
            }
            ans += (D % d) * (p + n * q);
            System.out.println(ans);
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

/*
#include <iostream>
using namespace std;
        typedef long long int ll;

        int main() {
        // your code goes here
        ll t;
        cin>>t;
        while(t--) {
        ll D,d,p,q;
        cin>>D>>d>>p>>q;
        ll n = D/d;
        ll ans = 0;
        if( n % 2 == 0) {
        ans = d * n/2 * (2 * p + (n - 1) * q);
        } else {
        ans = d * n * (p + ((n - 1)/2) * q);
        }
        ans += (D % d) * (p + n * q);
        cout<<ans<<endl;
        }
        return 0;
        }
*/
