package string;

public class reformatDate {

    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));
        System.out.println(reformatDate("6th Jun 1933"));
        System.out.println(reformatDate("26th May 1960"));
        System.out.println(reformatDate("6th Jun 1933"));
    }

    public static String reformatDate(String date) {
        StringBuilder res = new StringBuilder();
        res.append(date.substring(date.length()-4)+"-");
        switch(date.substring(date.length()-8,date.length()-5)) {
            case "Jan": {
                res.append("01-");
                break;
            }
            case "Feb": {
                res.append("02-");
                break;
            }
            case "Mar": {
                res.append("03-");
                break;
            }
            case "Apr": {
                res.append("04-");
                break;
            }
            case "May": {
                res.append("05-");
                break;
            }
            case "Jun": {
                res.append("06-");
                break;
            }
            case "Jul": {
                res.append("07-");
                break;
            }
            case "Aug": {
                res.append("08-");
                break;
            }
            case "Sep": {
                res.append("09-");
                break;
            }
            case "Oct": {
                res.append("10-");
                break;
            }
            case "Nov": {
                res.append("11-");
                break;
            }
            case "Dec": {
                res.append("12-");
                break;
            }
        }
        if((date.length()-9) == 3)
            res.append("0").append(date.charAt(0));
        else
            res.append(date, 0, 2);
        return res.toString();
    }
}
