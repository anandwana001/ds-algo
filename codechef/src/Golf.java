package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Golf {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        long T = in.nextInt();
        while (T-- > 0) {
            long n = in.nextInt();
            long x = in.nextInt();
            long k = in.nextInt();

            if(x % k == 0 || (n+1)-x % k == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
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

// Failing in Java in codechef but passing in c++ due to data type issue
/*#include <iostream>
#include<bits/stdc++.h>
        using namespace std;
        typedef long long int ll;
        int main() {
        // your code goes here
        ios::sync_with_stdio(0);
        cin.tie(0);
        ll T,N,x,k;
        cin>>T;
        while(T-- >0) {
        cin>>N>>x>>k;
        if(x%k==0 || (N+1-x)%k==0){
        cout<<"YES"<<endl;
        }
        else{
        cout<<"NO"<<endl;
        }
        }
        return 0;
        }*/
