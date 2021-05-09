package string;

public class mergeAlternately {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int i = 0;
        int j = 0;
        int w1l = w1.length;
        int w2l = w2.length;

        while(i < w1l && j < w2l) {
            res.append(w1[i++]);
            res.append(w2[j++]);
        }

        while(i < w1l)
            res.append(w1[i++]);

        while(j < w2l)
            res.append(w2[j++]);

        return res.toString();
    }
}
