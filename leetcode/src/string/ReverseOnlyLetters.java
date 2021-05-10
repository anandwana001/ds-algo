package string;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {
        if(s.length() == 1 || s.isEmpty()) return s;

        StringBuilder str = new StringBuilder(s);
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (Character.isLetter(s.charAt(start)) && Character.isLetter(s.charAt(end))) {
                str.setCharAt(start, s.charAt(end));
                str.setCharAt(end, s.charAt(start));
                start++;
                end--;
            }
            else if (Character.isLetter(s.charAt(start)) && !Character.isLetter(s.charAt(end))) {
                str.setCharAt(end, s.charAt(end));
                end--;
            }
            else if (!Character.isLetter(s.charAt(start)) && Character.isLetter(s.charAt(end))) {
                str.setCharAt(start, s.charAt(start));
                start++;
            }
            else {
                str.setCharAt(end, s.charAt(end));
                str.setCharAt(start, s.charAt(start));
                start++;
                end--;
            }
        }
        return str.toString();
    }
}
