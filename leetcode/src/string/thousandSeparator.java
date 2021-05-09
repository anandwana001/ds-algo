package string;

public class thousandSeparator {

    public static void main(String[] args) {
        System.out.println(thousandSeparator(987));
        System.out.println(thousandSeparator(1234));
        System.out.println(thousandSeparator(123456789));
        System.out.println(thousandSeparator(0));
    }

    public static String thousandSeparator(int n) {
        if(n < 1000) return String.valueOf(n);

        StringBuffer res = new StringBuffer();
        int count = 0;
        int r = 0;
        int l = String.valueOf(n).length();

        for (int i = l - 1; i >= 0; i--) {
            r = n % 10;
            n = n / 10;
            count++;
            if (((count % 3) == 0) && (i != 0)) {
                res.append(r);
                res.append('.');
            } else {
                res.append(r);
            }
        }
        res.reverse();
        return res.toString();
    }
}
