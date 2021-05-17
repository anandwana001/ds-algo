package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class ModularEquation {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int count = 0 ;
            List<Integer> mod = new ArrayList<>();
            mod.addAll(Collections.nCopies(n+1, 1));
            for(int i =2; i<=n; i++) {
                int a = m % i;
                count+= mod.get(a);
                for(int j =a; j<=n; j+=i) {
                    mod.set(j, j++);
                }
            }
            System.out.println(count);
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

    int main() {
        // your code goes here
        ll t;
        cin>>t;
        while (t-- > 0) {
            ll n, m, count = 0, a;
            cin>>n;
            cin>>m;
            vector<ll> mod(n+1, 1);
            for(ll i = 2; i <= n; i++) {
                a = m % i;
                count += mod[a];
                for(ll j = a; j <= n; j+=i) {
                    mod[j]++;
                }
            }
            cout<<count<<endl;
        }

        return 0;
    }
*/

