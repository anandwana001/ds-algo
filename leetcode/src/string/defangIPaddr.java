package string;

public class defangIPaddr {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));
    }

    public static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        String defanged = "[.]";
        for(int i=0; i<address.length(); i++) {
            if(address.charAt(i) == '.') {
                result.append(defanged);
            } else {
                result.append(address.charAt(i));
            }
        }
        return result.toString();
    }
}
