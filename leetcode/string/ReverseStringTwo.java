package string;

public class ReverseStringTwo {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 4));
        System.out.println(reverseStr("abcdefg", 1));
        System.out.println(reverseStr("a", 4));
        System.out.println(reverseStr("abcdefg", 3));
        System.out.println(reverseStr("abcdefg", 8));
    }

    public static String reverseStr(String s, int k) {
        if(k == 1) return s;

        StringBuilder str = new StringBuilder(s);
        int i = 0;

        while(i < str.length()) {
            int left = i;
            int right = Math.min(i + k - 1, str.length() - 1);
            while(left < right) {
                char a = str.charAt(left);
                char b = str.charAt(right);
                str.setCharAt(left, b);
                str.setCharAt(right, a);
                left++;
                right--;
            }
            i = i + 2 * k;
        }
        return str.toString();
    }

    //////////////////////////////////////////////////////////////////////

    /*public String reverseString(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i+=k) {
            if((i/k) % 2 == 0) {
                sb.append(reverse(s.substring(i, Math.min(i+k, s.length()))));
            }
            else {
                sb.append(s.substring(i, Math.min(i+k, s.length())));
            }
        }

        return sb.toString();
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }*/
}
