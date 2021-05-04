package string;

public class toLowerCase {

    public static void main(String[] args) {
        System.out.println(toLowerCase("PPALLP"));
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
        System.out.println(toLowerCase("AksHaYNanDwAnA"));
    }

    public static String toLowerCase(String str) {
        StringBuilder s = new StringBuilder();

        int i = 0;
        while(i < str.length()) {
            if(str.charAt(i) > 64 && str.charAt(i) < 91)
            {
                s.append((char) (str.charAt(i)+32));
            } else {
                s.append(str.charAt(i));
            }
            i++;
        }

        return s.toString();
    }
}
