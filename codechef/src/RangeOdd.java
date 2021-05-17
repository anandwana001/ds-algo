package codechef;

import java.util.Scanner;

public class RangeOdd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        int R = s.nextInt();

        for(int i=L; i<=R; i++) {
            if(i%2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
