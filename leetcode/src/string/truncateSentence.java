package string;

public class truncateSentence {

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
        System.out.println(truncateSentence("Hello how are", 4));
        System.out.println(truncateSentence("What is the solution to this problem", 4));
    }

    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==' '&&--k==0) break;
            sb.append(c);
        }
        return sb.toString();
    }
}
