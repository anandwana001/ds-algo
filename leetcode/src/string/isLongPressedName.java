package string;

public class isLongPressedName {

    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleex"));
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
        System.out.println(isLongPressedName("leelee", "lleeelee"));
        System.out.println(isLongPressedName("laiden", "laiden"));
        System.out.println(isLongPressedName("vtkgn", "vttkgnn"));
        System.out.println(isLongPressedName("a", "b"));
        System.out.println(isLongPressedName("alex", "aaleexa"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if(typed.length() < name.length()) return false;

        int flag = 0;

        for(int i=0; i<typed.length(); i++) {
            if(flag < name.length() && name.charAt(flag) == typed.charAt(i)) {
                flag++;
            } else if(i == 0 || typed.charAt(i) != typed.charAt(i - 1)) {
                return false;
            }
        }

        return flag == name.length();
    }
}
