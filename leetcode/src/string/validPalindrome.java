package string;

public class validPalindrome {

    private static int parity = 0;

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("abc"));
    }

    public static boolean validPalindrome(String s) {
        if(s.length() == 1) return true;

        return check(s, 0 , s.length() - 1);
    }

    private static boolean check(String s, int i, int j) {
        while (i <= j) {

            if (s.charAt(i) != s.charAt(j)){
                if(parity == 1) return false;

                parity++;
                return check(s, i+1, j) || check(s, i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }
}
