package string;

public class squareIsWhite {

    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("h3"));
        System.out.println(squareIsWhite("c7"));
        System.out.println(squareIsWhite("f7"));
    }

    public static boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 96;
        int y = coordinates.charAt(1);

        return (x + y) % 2 != 0;
    }
}
