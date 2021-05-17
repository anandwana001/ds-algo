package codechef;

import java.util.Scanner;

public class IsBothOrNot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String N = s.next();

        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i<N.length(); i++) {
            if(i % 2 == 0) {
                evenSum+= N.charAt(i) - '0';
            } else {
                oddSum+= N.charAt(i) - '0';
            }
        }
        int res = oddSum - evenSum;
        if(res % 11 == 0 && (N.charAt(N.length()-1) == '0' || N.charAt(N.length()-1) == '5'))
            System.out.println("BOTH");
        else if (N.charAt(N.length()-1) == '0' || N.charAt(N.length()-1) == '5')
            System.out.println("ONE");
        else if (res % 11 == 0)
            System.out.println("ONE");
        else
            System.out.println("NONE");
    }
}
