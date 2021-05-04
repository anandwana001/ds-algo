package string;

public class checkRecord {

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
        System.out.println(checkRecord("AAAAAA"));
        System.out.println(checkRecord("LLLLLL"));
        System.out.println(checkRecord("PPPPPP"));
        System.out.println(checkRecord("P"));
        System.out.println(checkRecord("AA"));
        System.out.println(checkRecord("LPLPLPLPLPL"));
    }

    public static boolean checkRecord(String s) {
        StringBuilder str = new StringBuilder(s);
        int absent = 0;
        int late = 0;
        for(int i=0; i< str.length(); i++) {
            if(str.charAt(i) == 'A') {
                absent++;
                late = 0;
            } else if(str.charAt(i) == 'L') {
                late++;
            } else {
                late = 0;
            }
            if(late >= 3 || absent >= 2) {
                return false;
            }
        }
        return true;
    }
}