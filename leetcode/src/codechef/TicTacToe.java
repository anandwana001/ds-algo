package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TicTacToe {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        int T = in.nextInt();
        while (T-- > 0) {
            char[][] arr = new char[3][3];
            int x = 0;
            int o = 0;
            int emp = 0;
            int xw=0;
            int ow = 0;
            for(int i=0; i<3; i++) {
                String data = "";
                if (in.hasNext()) {
                    data = in.next();
                } else {
                    break;
                }
                for(int j=0; j<3; j++) {
                    arr[i][j] = data.charAt(j);
                    if(arr[i][j] == 'X') x++;
                    else if(arr[i][j] == 'O') o++;
                    else emp++;
                }
            }
            for(int i=0; i<3; i++) {
                if(arr[i][0]==arr[i][1] && arr[i][1]==arr[i][2]) {
                    if(arr[i][0] == 'X') xw++;
                    else if(arr[i][0] == 'O') ow++;
                }
            }
            for(int i=0; i<3; i++) {
                if(arr[0][i]==arr[1][i] && arr[1][i]==arr[2][i]) {
                    if(arr[0][i] == 'X') xw++;
                    else if(arr[0][i] == 'O') ow++;
                }
            }
            if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2]) {
                if(arr[1][1] == 'X') xw++;
                else if(arr[1][1] == 'O') ow++;
            }
            if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0]) {
                if(arr[1][1] == 'X') xw++;
                else if(arr[1][1] == 'O') ow++;
            }

            if(o>x || x-o>1)
                System.out.println(3);
            else if(x>o && xw==1 && ow==0)
                System.out.println(1);
            else if(x==o && ow==1 && xw==0)
                System.out.println(1);
            else if(emp==0&&(xw+ow)==0)
                System.out.println(1);
            else if(emp==0&&xw==2)
                System.out.println(1);
            else if(emp>0 && (xw+ow)==0)
                System.out.println(2);
            else
                System.out.println(3);

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

        boolean hasNext() {
            if (tokenizer != null && tokenizer.hasMoreTokens()) {
                return true;
            }
            String tmp;
            try {
                reader.mark(1000);
                tmp = reader.readLine();
                if (tmp == null) {
                    return false;
                }
                reader.reset();
            } catch (IOException e) {
                return false;
            }
            return true;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
