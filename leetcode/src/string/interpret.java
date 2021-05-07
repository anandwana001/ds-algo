package string;

public class interpret {

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();

        int i=0;
        while(i < command.length()) {
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                result.append("o");
                i=i+2;
            } else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' &&
                    command.charAt(i+2) == 'l' && command.charAt(i+3) == ')') {
                result.append("al");
                i=i+4;
            } else {
                result.append(command.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
