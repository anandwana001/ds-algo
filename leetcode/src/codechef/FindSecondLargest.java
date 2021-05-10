package codechef;

import java.util.Scanner;

public class FindSecondLargest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        System.out.println(find_second(A,B,C));
    }

    private static int find_second(int a, int b, int c) {
        int smallest = min(min(a, b), c);
        int largest = max(max(a, b), c);

        return a ^ b ^ c ^ smallest ^ largest;
    }

    private static int min(int a , int b) {
        return a < b ? a : b;
    }

    private static int max(int a , int b) {
        return a > b ? a : b;
    }
}
