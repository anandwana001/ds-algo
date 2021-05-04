package string;

import java.util.Locale;

public class detectCapitalUse {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("fLaG"));
        System.out.println(detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {
        return word.equals(word.toLowerCase(Locale.ROOT)) || word.equals(word.toUpperCase(Locale.ROOT))  ||
                (word.substring(0,1).equals(word.substring(0,1).toUpperCase(Locale.ROOT)) &&
                        word.substring(1).equals(word.substring(1).toLowerCase(Locale.ROOT)));
    }

    /*public static boolean detectCapitalUse(String word) {
        int n=word.length();
        if(n==1)    return true;
        if(word.charAt(0)-'a'>=0){
            for(int i=1;i<n;i++)
                if(word.charAt(i)-'a'<0)
                    return false;

        }
        else{
            if(word.charAt(1)-'a'>=0){
                for(int i=1;i<n;i++)
                    if(word.charAt(i)-'a'<0)
                        return false;
            }
            else{
                for(int i=1;i<n;i++)
                    if(word.charAt(i)-'a'>=0)
                        return false;
            }

        }

        return true;

    }*/
}