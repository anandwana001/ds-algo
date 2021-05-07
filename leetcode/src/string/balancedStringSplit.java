package string;

public class balancedStringSplit {

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int balanced = 0;
        for(char c : s.toCharArray()) {
            balanced += c == 'L' ? -1 : 1;
            count += balanced == 0 ? 1 : 0;
        }
        return count;
    }
}
