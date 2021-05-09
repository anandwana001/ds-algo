package string;

public class replaceDigits {

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
        System.out.println(replaceDigits("a1b2c3d4e"));
        System.out.println(replaceDigits("a"));
    }

    public static String replaceDigits(String s) {
        if(s.length()==1) return s;

        StringBuilder res = new StringBuilder();

        for(int i=1; i<s.length(); i+=2){
            res.append(s.charAt(i-1));
            res.append((char)((int) s.charAt(i-1) + digitToInt(s.charAt(i))));
            if(i == s.length()-2) {
                res.append(s.charAt(i+1));
            }
        }

        return res.toString();
    }

    public static int digitToInt(char digit) {
        return (int)digit - (int)'0';
    }
}

