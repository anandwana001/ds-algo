package string;

public class halvesAreAlike {

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
        System.out.println(halvesAreAlike("MerryChristmas"));
        System.out.println(halvesAreAlike("AbCdEfGh"));
        System.out.println(halvesAreAlike("Uaec"));
    }

    public static boolean halvesAreAlike(String s) {
        int l = 0;
        int r = s.length()-1;
        int lcount = 0 ;
        int rcount = 0;

        while( l < r ) {
            if(isVowel(s.charAt(l))) {
                lcount++;
            }
            if(isVowel(s.charAt(r))) {
                rcount++;
            }
            l++;
            r--;
        }

        return lcount == rcount;
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
