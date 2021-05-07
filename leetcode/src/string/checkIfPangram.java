package string;

public class checkIfPangram {

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }

    public static boolean checkIfPangram(String sentence) {
        int checker = 0;
        for (int i = 0; i < sentence.length(); i++) {
            int val = sentence.charAt(i) - 'a';
            checker |= (1 << val);

            System.out.println("char -> "+val);
            System.out.println("left shift -> "+(1 << val));
            System.out.println("checker -> "+checker);
        }
        return checker == 67108863;
    }
}
