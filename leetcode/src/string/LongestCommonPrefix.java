package string;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strArr = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strArr));
    }


    public static String longestCommonPrefix(String[] strs) {

        if(strs.length==0) return "";

        int min = strs[0].length();

        String prefix = "";

        for(int i=0; i < min ;i++){

            for(int j =  1 ; j<strs.length; j++){

                if(strs[j].length()==0)
                    return "";

                if(strs[0].charAt(i) != strs[j].charAt(i))
                    return prefix;


                if (min > strs[j].length())
                    min = strs[j].length();
            }

            prefix += strs[0].charAt(i);

        }

        return prefix;

    }
}
