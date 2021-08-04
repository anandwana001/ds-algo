import java.util.*;

public class Test {

    static final List<Character> dict = Arrays.asList('B','A','L','O','N');

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("BAONXXOLL"));
        System.out.println(maxNumberOfBalloons("BAOOLLNNOLOLGBAX"));
        System.out.println(maxNumberOfBalloons("QAWABAWONL"));
        System.out.println(maxNumberOfBalloons("ONLABLABLOON"));

        System.out.println(MaximumValueAdding5(268));
        System.out.println(MaximumValueAdding5(670));
        System.out.println(MaximumValueAdding5(0));
        System.out.println(MaximumValueAdding5(-8000));
        System.out.println(MaximumValueAdding5(8000));

    }

    public static int maxNumberOfBalloons(String text) {
        int[] d = new int[26];
        for(char a: text.toCharArray()) {
            d[a-'A']++;
        }
        int res = Integer.MAX_VALUE;

        for(int i = 0 ; i<d.length;i++) {
            char cur = (char)(i +'A');
            if(dict.contains(cur)) {
                if(cur=='L' || cur=='O') {
                    res = Math.min(res, d[i]/2);
                } else res = Math.min(res, d[i]);

            }
        }
        return res;
    }

    public static int MaximumValueAdding5(int N) {
        int digit = 5;
        if (N == 0) return digit * 10;
        int neg = N/Math.abs(N);
        N = Math.abs(N);
        int n = N;
        int ctr = 0;
        while (n > 0){
            ctr++;
            n = n / 10;
        }
        int pos = 1;
        int maxVal = Integer.MIN_VALUE;
        for (int i=0;i<=ctr;i++){
            int newVal = ((N/pos) * (pos*10)) + (digit*pos) + (N%pos);
            if (newVal * neg > maxVal){
                maxVal = newVal*neg;
            }
            pos = pos * 10;
        }
        return maxVal;
    }
}
